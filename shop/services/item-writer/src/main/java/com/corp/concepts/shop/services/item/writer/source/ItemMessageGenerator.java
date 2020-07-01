package com.corp.concepts.shop.services.item.writer.source;

import java.util.function.Supplier;

import org.springframework.context.annotation.Bean;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.kafka.support.KafkaNull;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import com.corp.concepts.shop.models.Item;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.EmitterProcessor;
import reactor.core.publisher.Flux;

@Service
@Slf4j(topic = "Item Message Generator Logger")
public class ItemMessageGenerator {

	private final EmitterProcessor<Message<?>> processor = EmitterProcessor.create();

	public void addItemMessage(Item item) {
		Message<Item> message = MessageBuilder.withPayload(item).setHeader(KafkaHeaders.MESSAGE_KEY, item.getId())
				.build();

		processor.onNext(message);

		log.info("Message sent");
	}

	public void deleteItemMessage(Long itemId) {
		// Use tombstone message to remove item data from Kafka
		Message<KafkaNull> message = MessageBuilder.withPayload(KafkaNull.INSTANCE)
				.setHeader(KafkaHeaders.MESSAGE_KEY, itemId).build();

		processor.onNext(message);

		log.info("Message sent");
	}

	@Bean
	public Supplier<Flux<?>> output() {
		return () -> processor;
	}

}
