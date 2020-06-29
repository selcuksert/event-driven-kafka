package com.turkishairlines.concepts.shop.services.cart.processor.beans;

import java.util.function.Consumer;

import org.apache.kafka.streams.kstream.KStream;
import org.apache.kafka.streams.kstream.Materialized;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.corp.concepts.shop.models.Cart;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j(topic = "Cart Processor Logger")
public class CartProcessor {

	@Value("${spring.cloud.stream.kafka.streams.binder.configuration.cart-materialized-as}")
	private String cartTable;

	@Bean
	public Consumer<KStream<Long, Cart>> sinkCart() {
		return input -> input.peek((key, cart) -> log.info("key: {} | cart: {}", key, cart))
				.toTable(Materialized.as(cartTable)).toStream();
	}

}
