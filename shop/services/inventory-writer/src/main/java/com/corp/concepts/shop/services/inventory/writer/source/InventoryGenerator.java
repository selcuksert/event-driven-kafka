package com.corp.concepts.shop.services.inventory.writer.source;

import java.util.function.Supplier;

import org.springframework.context.annotation.Bean;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import com.corp.concepts.shop.models.Inventory;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.EmitterProcessor;
import reactor.core.publisher.Flux;

@Service
@Slf4j(topic = "Inventory Generator Logger")
public class InventoryGenerator {

	private final EmitterProcessor<Message<?>> processor = EmitterProcessor.create();

	public void sendInventoryMessage(Inventory inventory) {
		Message<Inventory> message = MessageBuilder.withPayload(inventory)
				.setHeader(KafkaHeaders.MESSAGE_KEY, inventory.getItemId()).build();

		processor.onNext(message);

		log.info("Message sent");
	}

	@Bean
	public Supplier<Flux<?>> output() {
		return () -> processor;
	}

}
