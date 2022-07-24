package com.obelix.demo.saleorder.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * <h1>Obelix Demo - Microservices Test Bed/Harness - SaleOrder Service</h1> 
 * 
 * @author Sumith Puri
 * @version 1.0
 * @since 15-06-2020
 * @see Adapted from the Spring Pet Clinic Sample, https://github.com/spring-petclinic/spring-petclinic-microservices
 * 
 * Copyright <a href='https://www.sumithpuri.xyz'>Sumith Puri</a> (c) 2022, Under MIT License
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker
public class ObelixDemoSaleOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(ObelixDemoSaleOrderApplication.class, args);
	}

}
