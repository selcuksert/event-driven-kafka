package com.turkishairlines.concepts.shop.services.inventory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.schema.registry.client.EnableSchemaRegistryClient;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;

@SpringBootApplication
@EnableBinding(Source.class)
@EnableSchemaRegistryClient
public class InventoryProcessorApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryProcessorApplication.class, args);
		
	}
}
