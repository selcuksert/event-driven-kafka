package com.corp.concepts.shop.services.cart.processor.controller;

import java.util.stream.Collectors;

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
import com.corp.concepts.shop.models.ItemDb;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/cart")
public class CartController {

	@Value("${spring.cloud.stream.kafka.streams.binder.configuration.cart-materialized-as}")
	private String cartTable;

	@Value("${spring.cloud.stream.kafka.streams.binder.configuration.item-materialized-as}")
	private String itemTable;

	private InteractiveQueryService interactiveQueryService;

	public CartController(InteractiveQueryService interactiveQueryService) {
		this.interactiveQueryService = interactiveQueryService;
	}

	@GetMapping
	@ResponseBody
	public String getCartItem(@RequestParam(value = "customerId") Long customerId) {
		Cart cart = null;

		try {
			ReadOnlyKeyValueStore<Long, Cart> cartStore = interactiveQueryService.getQueryableStore(cartTable,
					QueryableStoreTypes.<Long, Cart>keyValueStore());

			ReadOnlyKeyValueStore<Long, ItemDb> itemStore = interactiveQueryService.getQueryableStore(itemTable,
					QueryableStoreTypes.<Long, ItemDb>keyValueStore());

			cart = cartStore.get(customerId);

			if (cart.getCartItems() != null) {
				cart.setCartItems(cart.getCartItems().stream().map(cartItem -> {
					cartItem.setItem(itemStore.get(cartItem.getItem().getId()));
					return cartItem;
				}).collect(Collectors.toList()));
			}

			return cart.toString();

		} catch (Exception e) {
			log.error("Error when getting cart data:", e);
			return "Error occured. Please try again later.";
		}
	}
}
