package com.corp.concepts.shop.services.inventory.processor.controller;

import org.apache.kafka.streams.state.QueryableStoreTypes;
import org.apache.kafka.streams.state.ReadOnlyKeyValueStore;
import org.springframework.cloud.stream.binder.kafka.streams.InteractiveQueryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.corp.concepts.shop.models.Inventory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(value = "/inventory")
public class InventoryController {

	private InteractiveQueryService interactiveQueryService;

	public InventoryController(InteractiveQueryService interactiveQueryService) {
		this.interactiveQueryService = interactiveQueryService;
	}

	@GetMapping("/item")
	@ResponseBody
	public String getItemById(@RequestParam(value = "id") Long itemId) {
		try {
			ReadOnlyKeyValueStore<Long, Inventory> keyValueStore = interactiveQueryService
					.getQueryableStore("inventory-table", QueryableStoreTypes.<Long, Inventory>keyValueStore());

			Inventory inventory = keyValueStore.get(itemId);

			if (inventory != null) {
				return inventory.toString();
			}

		} catch (Exception e) {
			log.error("Error during sending message to broker:", e);
			return "Error occured. Please try again later.";
		}

		return "Not found";
	}
}
