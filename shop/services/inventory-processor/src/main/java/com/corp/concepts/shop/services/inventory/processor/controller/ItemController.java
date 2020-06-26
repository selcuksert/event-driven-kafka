package com.corp.concepts.shop.services.inventory.processor.controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.apache.kafka.streams.KeyValue;
import org.apache.kafka.streams.state.KeyValueIterator;
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

import com.corp.concepts.shop.models.Item;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/items")
public class ItemController {
	private InteractiveQueryService interactiveQueryService;

	@Value("${spring.cloud.stream.kafka.streams.binder.configuration.item-materialized-as}")
	private String itemTable;

	public ItemController(InteractiveQueryService interactiveQueryService) {
		this.interactiveQueryService = interactiveQueryService;
	}

	@GetMapping("/item")
	@ResponseBody
	public String getItemById(@RequestParam(value = "id") Long itemId) {
		try {
			ReadOnlyKeyValueStore<Long, Item> keyValueStore = interactiveQueryService.getQueryableStore(itemTable,
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

	@GetMapping
	@ResponseBody
	public List<Item> getItems() {
		List<Item> itemList = new ArrayList<>();
		try {
			ReadOnlyKeyValueStore<Long, Item> keyValueStore = interactiveQueryService.getQueryableStore(itemTable,
					QueryableStoreTypes.<Long, Item>keyValueStore());

			KeyValueIterator<Long, Item> items = keyValueStore.all();

			if (items != null) {
				if (items != null) {
					while (items.hasNext()) {
						KeyValue<Long, Item> item = items.next();
						itemList.add(item.value);
					}
					itemList.sort(Comparator.comparing(Item::getId));
				}
			}

		} catch (Exception e) {
			log.error("Error when getting items:", e);
		}

		return itemList;
	}

	@GetMapping("/category")
	@ResponseBody
	public List<Item> getItemsByCategory(@RequestParam(value = "name") String name) {
		List<Item> itemList = new ArrayList<>();
		try {
			ReadOnlyKeyValueStore<Long, Item> keyValueStore = interactiveQueryService.getQueryableStore(itemTable,
					QueryableStoreTypes.<Long, Item>keyValueStore());

			KeyValueIterator<Long, Item> items = keyValueStore.all();

			if (items != null) {
				while (items.hasNext()) {
					KeyValue<Long, Item> item = items.next();
					if (name.trim().equalsIgnoreCase(item.value.getCategory().trim())) {
						itemList.add(item.value);
					}
				}
				itemList.sort(Comparator.comparing(Item::getId));
			}

		} catch (Exception e) {
			log.error("Error when getting items:", e);
		}

		return itemList;
	}

}
