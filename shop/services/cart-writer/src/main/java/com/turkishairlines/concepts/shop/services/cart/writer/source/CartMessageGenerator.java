package com.turkishairlines.concepts.shop.services.cart.writer.source;

import org.springframework.cloud.stream.messaging.Source;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.kafka.support.KafkaNull;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import com.corp.concepts.shop.models.Cart;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j(topic = "Cart Message Generator Logger")
public class CartMessageGenerator {

	private Source source;

	public CartMessageGenerator(Source source) {
		this.source = source;
	}

	public void addCartMessage(Cart cart) {
		Message<Cart> message = MessageBuilder.withPayload(cart)
				.setHeader(KafkaHeaders.MESSAGE_KEY, cart.getCustomerId()).build();

		source.output().send(message);

		log.info("Message sent");
	}

	public void deleteCartMessage(Long customerId) {
		// Use tombstone message to remove cart data from Kafka
		Message<KafkaNull> message = MessageBuilder.withPayload(KafkaNull.INSTANCE)
				.setHeader(KafkaHeaders.MESSAGE_KEY, customerId).build();

		source.output().send(message);

		log.info("Message sent");
	}

}
