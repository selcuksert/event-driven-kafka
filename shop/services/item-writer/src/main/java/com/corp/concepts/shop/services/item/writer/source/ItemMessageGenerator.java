package com.corp.concepts.shop.services.item.writer.source;

import org.springframework.cloud.stream.messaging.Source;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.kafka.support.KafkaNull;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import com.corp.concepts.shop.models.Item;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j(topic = "Item Message Generator Logger")
public class ItemMessageGenerator {

	private Source source;

	public ItemMessageGenerator(Source source) {
		this.source = source;
	}

	public void addItemMessage(Item item) {
		Message<Item> message = MessageBuilder.withPayload(item).setHeader(KafkaHeaders.MESSAGE_KEY, item.getId())
				.build();
		
		source.output().send(message);
		
		log.info("Message sent");
	}

	public void deleteItemMessage(Long itemId) {
		// Use tombstone message to remove item data from Kafka
		Message<KafkaNull> message = MessageBuilder.withPayload(KafkaNull.INSTANCE).setHeader(KafkaHeaders.MESSAGE_KEY, itemId)
				.build();
		
		source.output().send(message);
		
		log.info("Message sent");
	}

}
