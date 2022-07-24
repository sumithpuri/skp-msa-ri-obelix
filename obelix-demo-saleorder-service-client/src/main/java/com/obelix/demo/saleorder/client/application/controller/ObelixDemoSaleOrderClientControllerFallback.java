package com.obelix.demo.saleorder.client.application.controller;

import org.springframework.stereotype.Component;

@Component
public class ObelixDemoSaleOrderClientControllerFallback implements ObelixDemoSaleOrderClientController {

	@Override
	public String test() {
		StringBuffer str = new StringBuffer("Obelix Demo - Sale Order - Service Not Available. Please Try Later!, ");
		str.append(" \n[Technical Details] : Obelix Circuit Breaker Reports ~ Obelix Demo Sale Order ~ is Down!");
		return str.toString();
	}
}