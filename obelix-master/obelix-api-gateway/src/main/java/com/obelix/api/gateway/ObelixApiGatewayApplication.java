package com.obelix.api.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * <h1>Obelix - Microservices Reference Implementation - API Gateway</h1>
 * 
 * @author Sumith Puri
 * @version 1.0
 * @since 01-06-2020
 * @see Adapted from the Code Samples at https://www.javainuse.com/spring/cloud-gateway-eureka
 * 
 * Copyright <a href='https://www.sumithpuri.xyz'>Sumith Puri</a> (c) 2022, Under MIT License
 */
@SpringBootApplication
@EnableEurekaClient
public class ObelixApiGatewayApplication {

  public static void main(String[] args) {
    SpringApplication.run(ObelixApiGatewayApplication.class, args);
  }
}
