package com.corp.concepts.shop.services.cart.writer.controller;

import java.util.Calendar;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.corp.concepts.shop.models.Cart;
import com.corp.concepts.shop.services.cart.writer.source.CartMessageGenerator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/cart")
public class CartController {
	private final CartMessageGenerator cartMessageGenerator;

	public CartController(CartMessageGenerator cartMessageGenerator) {
		this.cartMessageGenerator = cartMessageGenerator;
	}

	@PostMapping
	@ResponseBody
	public String addCartMessage(@RequestBody Cart cart) {
		try {
			cart.setTimestamp(Calendar.getInstance().getTimeInMillis());
			this.cartMessageGenerator.addCartMessage(cart);
			return cart.toString();
		} catch (Exception e) {
			log.error("Error during sending message to broker:", e);
			return e.getMessage();
		}
	}

	@DeleteMapping
	@ResponseBody
	public String deleteCartMessage(@RequestParam(value = "customerId") Long customerId) {
		try {
			this.cartMessageGenerator.deleteCartMessage(customerId);
			return "Deleted";
		} catch (Exception e) {
			log.error("Error during sending message to broker:", e);
			return e.getMessage();
		}
	}

}
