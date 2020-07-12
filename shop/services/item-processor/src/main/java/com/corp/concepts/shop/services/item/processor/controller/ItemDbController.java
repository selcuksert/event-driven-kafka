package com.corp.concepts.shop.services.item.processor.controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.corp.concepts.shop.services.item.processor.entity.Item;
import com.corp.concepts.shop.services.item.processor.repository.ItemRepository;
import com.corp.concepts.shop.services.item.processor.service.ItemConvertor;

import lombok.extern.slf4j.Slf4j;

@Slf4j(topic = "Item DB Controller")
@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/items")
@ConditionalOnProperty(name = "custom.item.datasource.use", havingValue = "db", matchIfMissing = false)
public class ItemDbController {
	private ItemRepository itemRepository;
	private ItemConvertor itemConvertor;

	public ItemDbController(ItemRepository itemRepository, ItemConvertor itemConvertor) {
		this.itemRepository = itemRepository;
		this.itemConvertor = itemConvertor;
	}

	@GetMapping("/item")
	@ResponseBody
	public String getItemById(@RequestParam(value = "id") Long itemId) {
		try {

			Item item = itemRepository.findById(itemId).get();

			com.corp.concepts.shop.models.Item itemMessage = itemConvertor.convertToItemMessage(item);

			if (itemMessage != null) {
				return itemMessage.toString();
			}

		} catch (Exception e) {
			log.error("Error when getting data:", e);
			return "Error occured. Please try again later.";
		}

		return "Not found";
	}

	@GetMapping
	@ResponseBody
	public List<com.corp.concepts.shop.models.Item> getItems() {
		List<com.corp.concepts.shop.models.Item> itemList = new ArrayList<>();
		try {
			Iterator<Item> items = itemRepository.findAll().iterator();

			if (items != null) {
				if (items != null) {
					while (items.hasNext()) {
						Item item = items.next();
						com.corp.concepts.shop.models.Item itemMessage = itemConvertor.convertToItemMessage(item);

						itemList.add(itemMessage);
					}
					itemList.sort(Comparator.comparing(com.corp.concepts.shop.models.Item::getId));
				}
			}

		} catch (Exception e) {
			log.error("Error when getting items:", e);
		}

		return itemList;
	}

	@GetMapping("/category")
	@ResponseBody
	public List<com.corp.concepts.shop.models.Item> getItemsByCategory(@RequestParam(value = "name") String name) {
		List<com.corp.concepts.shop.models.Item> itemList = new ArrayList<>();
		try {
			Iterator<Item> items = itemRepository.findAll().iterator();

			if (items != null) {
				while (items.hasNext()) {
					Item item = items.next();
					if (name.trim().equalsIgnoreCase(item.getCategory().trim())) {
						com.corp.concepts.shop.models.Item itemMessage = itemConvertor.convertToItemMessage(item);

						itemList.add(itemMessage);
					}
				}
				itemList.sort(Comparator.comparing(com.corp.concepts.shop.models.Item::getId));
			}

		} catch (Exception e) {
			log.error("Error when getting items:", e);
		}

		return itemList;
	}

}
