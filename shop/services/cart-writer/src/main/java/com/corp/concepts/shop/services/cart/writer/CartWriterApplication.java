package com.corp.concepts.shop.services.cart.writer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.schema.registry.client.EnableSchemaRegistryClient;

@SpringBootApplication
@EnableSchemaRegistryClient
public class CartWriterApplication {

	public static void main(String[] args) {
		SpringApplication.run(CartWriterApplication.class, args);
	}

}
