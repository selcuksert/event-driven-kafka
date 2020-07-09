package com.corp.concepts.shop.services.item.processor.controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.corp.concepts.shop.services.item.processor.entity.Item;
import com.corp.concepts.shop.services.item.processor.repository.ItemRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/items")
public class ItemDbController {
	private ItemRepository itemRepository;

	public ItemDbController(ItemRepository itemRepository) {
		this.itemRepository = itemRepository;
	}

	@GetMapping("/item")
	@ResponseBody
	public String getItemById(@RequestParam(value = "id") Long itemId) {
		try {

			Item item = itemRepository.findById(itemId).get();

			if (item != null) {
				return item.toString();
			}

		} catch (Exception e) {
			log.error("Error when getting data:", e);
			return "Error occured. Please try again later.";
		}

		return "Not found";
	}

	@GetMapping
	@ResponseBody
	public List<Item> getItems() {
		List<Item> itemList = new ArrayList<>();
		try {
			Iterator<Item> items = itemRepository.findAll().iterator();

			if (items != null) {
				if (items != null) {
					while (items.hasNext()) {
						Item item = items.next();
						itemList.add(item);
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
			Iterator<Item> items = itemRepository.findAll().iterator();

			if (items != null) {
				while (items.hasNext()) {
					Item item = items.next();
					if (name.trim().equalsIgnoreCase(item.getCategory().trim())) {
						itemList.add(item);
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
