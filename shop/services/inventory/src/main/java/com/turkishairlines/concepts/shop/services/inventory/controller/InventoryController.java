package com.turkishairlines.concepts.shop.services.inventory.controller;

import org.apache.kafka.streams.state.QueryableStoreTypes;
import org.apache.kafka.streams.state.ReadOnlyKeyValueStore;
import org.springframework.cloud.stream.binder.kafka.streams.InteractiveQueryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.turkishairlines.concepts.shop.models.Inventory;
import com.turkishairlines.concepts.shop.services.inventory.service.InventoryService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(value = "/inventory")
public class InventoryController {

	private InteractiveQueryService interactiveQueryService;

	private final InventoryService inventoryService;

	public InventoryController(InventoryService inventoryService, InteractiveQueryService interactiveQueryService) {
		this.inventoryService = inventoryService;
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

	@PostMapping
	@ResponseBody
	public String sendInventoryMessage(@RequestBody Inventory inventory) {
		try {
			this.inventoryService.sendInventoryMessage(inventory);
			return inventory.toString();
		} catch (Exception e) {
			log.error("Error during sending message to broker:", e);
			return e.getMessage();
		}
	}

}
