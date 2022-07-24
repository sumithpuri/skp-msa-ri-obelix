package com.obelix.demo.saleorder.application.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RefreshScope
@RequestMapping("/obelixdemo")
public class ObelixDemoSaleOrderController {

    @GetMapping("/saleorder")
    public String test(){
        return "Obelix Demo - SaleOrder Service";
    }

    @Value("${user.role}")
	private String role;

	@GetMapping(value = "/user/{username}", produces = MediaType.TEXT_PLAIN_VALUE)
	public String whoami(@PathVariable("username") String username) {
		return String.format("Obelix Demo - SaleOrder - You're %s, System Set Role is %s...\n", username, role);
	}
    
}
