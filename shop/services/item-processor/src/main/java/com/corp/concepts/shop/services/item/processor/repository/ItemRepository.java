package com.corp.concepts.shop.services.item.processor.repository;

import org.springframework.data.repository.CrudRepository;

import com.corp.concepts.shop.services.item.processor.entity.Item;

public interface ItemRepository extends CrudRepository<Item, Long> {
}
