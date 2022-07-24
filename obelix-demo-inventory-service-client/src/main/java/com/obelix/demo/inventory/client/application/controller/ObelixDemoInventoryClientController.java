package com.obelix.demo.inventory.client.application.controller;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//@FeignClient(name = "request", url = "http://localhost:8083/", fallback = ObelixDemoInventoryClientControllerFallback.class)
@FeignClient(name = "inventory-service", fallback = ObelixDemoInventoryClientControllerFallback.class)
@RibbonClient(name="inventory-service")  
public interface ObelixDemoInventoryClientController {

	@RequestMapping(method = RequestMethod.GET, value="/request/portal")
	public String test();

	
}
