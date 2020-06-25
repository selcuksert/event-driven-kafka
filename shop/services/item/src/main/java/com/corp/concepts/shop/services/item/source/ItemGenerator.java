package com.corp.concepts.shop.services.item.source;

import org.springframework.cloud.stream.messaging.Source;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import com.corp.concepts.shop.models.Item;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j(topic = "Item Generator Logger")
public class ItemGenerator {

	private Source source;

	public ItemGenerator(Source source) {
		this.source = source;
	}

	public void sendItemMessage(Item item) {
		Message<Item> message = MessageBuilder.withPayload(item).setHeader(KafkaHeaders.MESSAGE_KEY, item.getId())
				.build();
		
		source.output().send(message);
		
		log.info("Message sent");
	}

}
