package com.corp.concepts.shop.services.item.processor.beans;

import java.util.function.Consumer;
import java.util.function.Function;

import org.apache.kafka.streams.KeyValue;
import org.apache.kafka.streams.kstream.KStream;
import org.apache.kafka.streams.kstream.Materialized;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.corp.concepts.shop.models.Item;
import com.corp.concepts.shop.models.ItemDb;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j(topic = "Item Reader Logger")
public class ItemProcessor {

	@Value("${spring.cloud.stream.kafka.streams.binder.configuration.item-materialized-as}")
	private String itemTable;

	private ObjectMapper objectMapper;

	public ItemProcessor() {
		this.objectMapper = new ObjectMapper();
	}

	@Bean
	public Consumer<KStream<Long, Item>> sinkItem() {
		return input -> input.peek((key, item) -> log.info("key: {} | item: {}", key, item))
				.toTable(Materialized.as(itemTable)).toStream();
	}

	@Bean
	public Function<KStream<Long, Item>, KStream<Long, ItemDb>> sendToDbTopic() {
		return input -> input.map((key, item) -> {
			ItemDb itemDb = null;
			try {
				if (item != null) {
					itemDb = new ItemDb(item.getId(), item.getName(), item.getTitle(), item.getCategory(),
							item.getPrice(), item.getDescription(), item.getImage(), item.getLargeimage(),
							objectMapper.writeValueAsString(item.getFeatures()));
				}
			} catch (JsonProcessingException e) {
				log.error("Error: ", e);
			}
			return new KeyValue<>(key, itemDb);
		});
	}
}
