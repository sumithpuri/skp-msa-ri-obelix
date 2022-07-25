/**
 * 
 */
package com.obelix.demo.inventory.client.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ObelixDemoInventoryCircuitBreakerController {
	
    @Autowired
    private ObelixDemoInventoryClientController obelixDemoInventoryClientController;

    @RequestMapping("/obelixdemocb/inventory")
    public String testNow(Model model) {
        model.addAttribute("inventoryCBMsg", obelixDemoInventoryClientController.test());
        return "inventory-view";
    }
}