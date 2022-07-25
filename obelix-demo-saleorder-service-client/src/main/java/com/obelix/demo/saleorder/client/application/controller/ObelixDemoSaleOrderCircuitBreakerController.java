/**
 * 
 */
package com.obelix.demo.saleorder.client.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ObelixDemoSaleOrderCircuitBreakerController {
	
    @Autowired
    private ObelixDemoSaleOrderClientController obelixDemoSaleOrderClientController;

    @RequestMapping("/obelixdemocb/saleorder")
    public String testNow(Model model) {
        model.addAttribute("saleorderCBMsg", obelixDemoSaleOrderClientController.test());
        return "saleorder-view";
    }
}