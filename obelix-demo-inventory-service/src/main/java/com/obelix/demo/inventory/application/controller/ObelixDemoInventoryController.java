package com.obelix.demo.inventory.application.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
@RequestMapping("/obelixdemo")
public class ObelixDemoInventoryController {

	@GetMapping("/inventory")
	public String test() {
		return "Obelix Demo - Inventory Service";
	}

	 @Value("${user.role}")
	private String role;

	@GetMapping(value = "/user/{username}", produces = MediaType.TEXT_PLAIN_VALUE)
	public String whoami(@PathVariable("username") String username) {
			return String.format("Obelix Demo - Inventory - You're %s, System Set Role is %s...\n", username, role);
	}
}