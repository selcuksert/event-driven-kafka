package com.corp.concepts.shop.services.cart.processor.beans;

import java.util.function.BiConsumer;

import org.apache.kafka.streams.kstream.KStream;
import org.apache.kafka.streams.kstream.Materialized;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.corp.concepts.shop.models.Cart;
import com.corp.concepts.shop.models.ItemDb;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j(topic = "Cart Processor Logger")
public class CartProcessor {

	@Value("${spring.cloud.stream.kafka.streams.binder.configuration.cart-materialized-as}")
	private String cartTable;

	@Value("${spring.cloud.stream.kafka.streams.binder.configuration.item-materialized-as}")
	private String itemTable;

	@Bean
	public BiConsumer<KStream<Long, Cart>, KStream<Long, ItemDb>> processCart() {
		return (cartStream, itemStream) -> {
			cartStream.peek((key, cart) -> log.info("key: {} | cart: {}", key, cart))
					.toTable(Materialized.as(cartTable)).toStream();

			itemStream.peek((key, item) -> log.info("key: {} | item: {}", key, item))
					.toTable(Materialized.as(itemTable)).toStream();
		};
	}
}
