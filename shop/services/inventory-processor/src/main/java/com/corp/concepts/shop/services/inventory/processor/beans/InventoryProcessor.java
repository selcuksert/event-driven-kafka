package com.corp.concepts.shop.services.inventory.processor.beans;

import java.util.function.Consumer;
import java.util.function.Function;

import org.apache.kafka.streams.KeyValue;
import org.apache.kafka.streams.kstream.KStream;
import org.apache.kafka.streams.kstream.Materialized;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.corp.concepts.shop.models.Inventory;
import com.corp.concepts.shop.models.Item;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j(topic = "Inventory Processor Logger")
public class InventoryProcessor {

	@Value("${spring.cloud.stream.kafka.streams.binder.configuration.inventory-materialized-as}")
	private String inventoryTable;

	@Bean
	public Function<KStream<Long, Item>, KStream<Long, Inventory>> processItem() {
		return input -> input.peek((key, item) -> log.info("key: {} | item: {}", key, item)).map((key, item) -> {
			if (item == null) {
				// Tombstone message for item.
				// Remove inventory also with another tombstone message
				return new KeyValue<>(key, null);
			}
			return new KeyValue<>(key, new Inventory(key, 0));
		});
	}

	@Bean
	public Consumer<KStream<Long, Inventory>> sinkInventory() {
		return input -> input.peek((key, inventory) -> log.info("key: {} | inventory: {}", key, inventory))
				.toTable(Materialized.as(inventoryTable)).toStream();
	}

}