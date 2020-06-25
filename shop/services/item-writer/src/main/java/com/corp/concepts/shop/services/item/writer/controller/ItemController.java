package com.corp.concepts.shop.services.item.writer.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.corp.concepts.shop.models.Item;
import com.corp.concepts.shop.services.item.writer.source.ItemGenerator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(value = "/item")
public class ItemController {
	private final ItemGenerator itemGenerator;

	public ItemController(ItemGenerator itemGenerator) {
		this.itemGenerator = itemGenerator;
	}

	@PostMapping
	@ResponseBody
	public String sendItemMessage(@RequestBody Item item) {
		try {
			this.itemGenerator.sendItemMessage(item);
			return item.toString();
		} catch (Exception e) {
			log.error("Error during sending message to broker:", e);
			return e.getMessage();
		}
	}

}
