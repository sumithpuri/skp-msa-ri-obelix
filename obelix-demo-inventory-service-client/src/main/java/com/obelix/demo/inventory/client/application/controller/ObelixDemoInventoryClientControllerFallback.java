package com.obelix.demo.inventory.client.application.controller;

import org.springframework.stereotype.Component;

@Component
public class ObelixDemoInventoryClientControllerFallback implements ObelixDemoInventoryClientController {

	@Override
	public String test() {
		StringBuffer str = new StringBuffer("Obelix Demo - Inventory - Service Not Available. Please Try Later!, ");
		str.append(" \n[Technical Details] : Obelix Circuit Breaker Reports ~ Obelix Demo Inventory ~ is Down!");
		return str.toString();
	}
}