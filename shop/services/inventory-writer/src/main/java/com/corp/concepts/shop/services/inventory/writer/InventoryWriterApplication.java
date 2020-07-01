package com.corp.concepts.shop.services.inventory.writer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.schema.registry.client.EnableSchemaRegistryClient;

@SpringBootApplication
@EnableSchemaRegistryClient
public class InventoryWriterApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryWriterApplication.class, args);
	}

}
