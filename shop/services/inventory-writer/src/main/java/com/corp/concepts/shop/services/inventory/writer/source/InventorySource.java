package com.corp.concepts.shop.services.inventory.writer.source;

import org.springframework.cloud.stream.messaging.Source;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import com.corp.concepts.shop.models.Inventory;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class InventorySource {

	private Source source;

	public InventorySource(Source source) {
		this.source = source;
	}

	public void sendInventoryMessage(Inventory inventory) {
		Message<Inventory> message = MessageBuilder.withPayload(inventory)
				.setHeader(KafkaHeaders.MESSAGE_KEY, inventory.getItemId()).build();

		source.output().send(message);

		log.info("Message sent");
	}

}
