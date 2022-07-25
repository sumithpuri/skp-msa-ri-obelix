package com.obelix.demo.saleorder.client.application.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "obelix-demo-saleorder-service", url = "http://localhost:8084/", fallback = ObelixDemoSaleOrderClientControllerFallback.class)
public interface ObelixDemoSaleOrderClientController {

	@RequestMapping(method = RequestMethod.GET, value="/obelixdemo/saleorder")
	public String test();

	
}
