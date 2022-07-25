package com.obelix.demo.inventory.client.application.controller;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//@FeignClient(name = "request", url = "http://localhost:8083/", fallback = ObelixDemoInventoryClientControllerFallback.class)
@FeignClient(name = "obelix-demo-inventory-service", fallback = ObelixDemoInventoryClientControllerFallback.class)
@RibbonClient(name="obelix-demo-inventory-service")  
public interface ObelixDemoInventoryClientController {

	@RequestMapping(method = RequestMethod.GET, value="/obelixdemo/inventory")
	public String test();

	
}
