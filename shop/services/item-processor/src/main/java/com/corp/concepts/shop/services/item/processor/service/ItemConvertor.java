package com.corp.concepts.shop.services.item.processor.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.corp.concepts.shop.models.Item;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ItemConvertor {
	private ObjectMapper mapper;

	public ItemConvertor() {
		this.mapper = new ObjectMapper();
	}

	public Item convertToItemMessage(com.corp.concepts.shop.services.item.processor.entity.Item item) {
		if (item != null) {
			List<String> featureList = null;

			if (item.getFeatures() != null) {
				try {
					featureList = Arrays.asList(mapper.readValue(item.getFeatures(), String[].class));
				} catch (Exception e) {
					featureList = new ArrayList<>();
					log.error("Error:", e);
				}
			}

			Item avroItem = new Item(item.getId(), item.getName(), item.getTitle(), item.getCategory(), item.getPrice(),
					item.getDescription(), item.getImage(), item.getLargeimage(), featureList);

			return avroItem;
		}

		return null;

	}

}
