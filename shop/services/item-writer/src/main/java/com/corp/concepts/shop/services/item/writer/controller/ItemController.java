package com.corp.concepts.shop.services.item.writer.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.corp.concepts.shop.models.Item;
import com.corp.concepts.shop.services.item.writer.source.ItemMessageGenerator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/item")
public class ItemController {
	private final ItemMessageGenerator itemGenerator;

	public ItemController(ItemMessageGenerator itemGenerator) {
		this.itemGenerator = itemGenerator;
	}

	@PostMapping
	@ResponseBody
	public String sendItemMessage(@RequestBody List<Item> items) {
		try {
			items.stream().forEach(item -> this.itemGenerator.addItemMessage(item));
			return "Processed " + items.size() + " item(s).";
		} catch (Exception e) {
			log.error("Error during sending message to broker:", e);
			return e.getMessage();
		}
	}

	@DeleteMapping
	@ResponseBody
	public String deleteItemMessage(@RequestBody List<Long> itemIdList) {
		try {
			itemIdList.stream().forEach(itemId -> this.itemGenerator.deleteItemMessage(itemId));
			return "Processed " + itemIdList.size() + " item(s).";
		} catch (Exception e) {
			log.error("Error during sending message to broker:", e);
			return e.getMessage();
		}
	}

}
