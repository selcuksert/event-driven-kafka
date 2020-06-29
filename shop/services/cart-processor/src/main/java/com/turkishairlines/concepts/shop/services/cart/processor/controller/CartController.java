package com.turkishairlines.concepts.shop.services.cart.processor.controller;

import org.apache.kafka.streams.state.QueryableStoreTypes;
import org.apache.kafka.streams.state.ReadOnlyKeyValueStore;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.binder.kafka.streams.InteractiveQueryService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.corp.concepts.shop.models.Cart;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/cart")
public class CartController {

	@Value("${spring.cloud.stream.kafka.streams.binder.configuration.cart-materialized-as}")
	private String tableName;

	private InteractiveQueryService interactiveQueryService;

	public CartController(InteractiveQueryService interactiveQueryService) {
		this.interactiveQueryService = interactiveQueryService;
	}

	@GetMapping
	@ResponseBody
	public String getCartItem(@RequestParam(value = "customerId") Long customerId) {
		try {
			ReadOnlyKeyValueStore<Long, Cart> keyValueStore = interactiveQueryService.getQueryableStore(tableName,
					QueryableStoreTypes.<Long, Cart>keyValueStore());

			Cart cart = keyValueStore.get(customerId);

			if (cart != null) {
				return cart.toString();
			}

		} catch (Exception e) {
			log.error("Error when sending message to broker:", e);
			return "Error occured. Please try again later.";
		}

		return "Not found";
	}

}
