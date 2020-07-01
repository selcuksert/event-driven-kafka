package com.corp.concepts.shop.services.item.writer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.schema.registry.client.EnableSchemaRegistryClient;

@SpringBootApplication
@EnableSchemaRegistryClient
public class ItemWriterApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItemWriterApplication.class, args);
	}

}
