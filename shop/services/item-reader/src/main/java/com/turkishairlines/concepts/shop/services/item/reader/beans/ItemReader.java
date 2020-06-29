package com.turkishairlines.concepts.shop.services.item.reader.beans;

import java.util.function.Consumer;

import org.apache.kafka.streams.kstream.KStream;
import org.apache.kafka.streams.kstream.Materialized;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.corp.concepts.shop.models.Item;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j(topic = "Item Reader Logger")
public class ItemReader {

	@Value("${spring.cloud.stream.kafka.streams.binder.configuration.item-materialized-as}")
	private String itemTable;

	@Bean
	public Consumer<KStream<Long, Item>> sinkItem() {
		return input -> input.peek((key, item) -> log.info("key: {} | item: {}", key, item))
				.toTable(Materialized.as(itemTable)).toStream();
	}

}
