package com.corp.concepts.shop.services.inventory.processor.controller;

import org.apache.kafka.streams.state.QueryableStoreTypes;
import org.apache.kafka.streams.state.ReadOnlyKeyValueStore;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.binder.kafka.streams.InteractiveQueryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.corp.concepts.shop.models.Inventory;
import com.corp.concepts.shop.models.Item;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(value = "/inventory")
public class InventoryController {

	private InteractiveQueryService interactiveQueryService;

	public InventoryController(InteractiveQueryService interactiveQueryService) {
		this.interactiveQueryService = interactiveQueryService;
	}

	@GetMapping
	@ResponseBody
	public String getInventoryItemById(@RequestParam(value = "itemId") Long itemId,
			@Value("${spring.cloud.stream.kafka.streams.binder.configuration.inventory-materialized-as}") String tableName) {
		try {
			ReadOnlyKeyValueStore<Long, Inventory> keyValueStore = interactiveQueryService.getQueryableStore(tableName,
					QueryableStoreTypes.<Long, Inventory>keyValueStore());

			Inventory inventory = keyValueStore.get(itemId);

			if (inventory != null) {
				return inventory.toString();
			}

		} catch (Exception e) {
			log.error("Error when sending message to broker:", e);
			return "Error occured. Please try again later.";
		}

		return "Not found";
	}

	@GetMapping("/item")
	@ResponseBody
	public String getItemById(@RequestParam(value = "id") Long itemId,
			@Value("${spring.cloud.stream.kafka.streams.binder.configuration.item-materialized-as}") String tableName) {
		try {
			ReadOnlyKeyValueStore<Long, Item> keyValueStore = interactiveQueryService.getQueryableStore(tableName,
					QueryableStoreTypes.<Long, Item>keyValueStore());

			Item item = keyValueStore.get(itemId);

			if (item != null) {
				return item.toString();
			}

		} catch (Exception e) {
			log.error("Error when sending message to broker:", e);
			return "Error occured. Please try again later.";
		}

		return "Not found";
	}
}
