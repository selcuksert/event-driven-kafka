package com.corp.concepts.shop.services.inventory.writer.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.corp.concepts.shop.models.Inventory;
import com.corp.concepts.shop.services.inventory.writer.source.InventoryGenerator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(value = "/inventory")
public class InventoryController {

	private final InventoryGenerator inventoryGenerator;

	public InventoryController(InventoryGenerator inventoryGenerator) {
		this.inventoryGenerator = inventoryGenerator;
	}

	@PostMapping
	@ResponseBody
	public String sendInventoryMessage(@RequestBody Inventory inventory) {
		try {
			this.inventoryGenerator.sendInventoryMessage(inventory);
			return inventory.toString();
		} catch (Exception e) {
			log.error("Error during sending message to broker:", e);
			return e.getMessage();
		}
	}
}
