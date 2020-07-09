package com.corp.concepts.shop.services.item.processor.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "itemsdb")
@Entity
@NoArgsConstructor
@Getter
@Setter
public class Item {

	@Id
	private long id;

	private String name;
	private String title;
	private String category;
	private double price;
	private String description;
	private String image;
	private String largeimage;
	private String features;

}
