package com.turkishairlines.concepts.shop.services.inventory.processor;

import java.util.function.Consumer;
import java.util.function.Function;

import org.apache.kafka.streams.KeyValue;
import org.apache.kafka.streams.kstream.KStream;
import org.apache.kafka.streams.kstream.Materialized;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.turkishairlines.concepts.shop.models.Inventory;
import com.turkishairlines.concepts.shop.models.Item;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j(topic = "Inventory Processor Logger")
public class Processor {

	@Bean
	public Consumer<KStream<Long, Item>> sinkItem() {
		return input -> input.peek((key, value) -> log.info("Item - Key: {} | Value: {}", key, value));
	}

	@Bean
	public Consumer<KStream<Long, Inventory>> sinkInventory() {
		return input -> input.peek((key, value) -> log.info("Inventory - Key: {} | Value: {}", key, value));
	}

	@Bean
	public Function<KStream<Long, Item>, KStream<Long, Inventory>> process() {
		return input -> input.map((key, item) -> new KeyValue<>(key, new Inventory(item.getId(), 0)))
				.toTable(Materialized.as("inventory-table")).toStream();
	}

}