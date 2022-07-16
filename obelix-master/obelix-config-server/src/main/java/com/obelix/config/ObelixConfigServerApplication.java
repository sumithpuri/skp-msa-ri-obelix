package com.obelix.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * <h1>Obelix - Microservices Reference Implementation - API Gateway</h1>
 * 
 * <p>
 * <b>Note:</b> Config Server will be Read at the Startup and at Configured Intervals to Update Properties.
 * 
 * @author Sumith Puri
 * @version 1.0
 * @since 01-06-2020
 * @see Adapted from the Spring Pet Clinic Sample, https://github.com/spring-petclinic/spring-petclinic-microservices
 * 
 * Copyright <a href='https://www.sumithpuri.xyz'>Sumith Puri</a> (c) 2022, Under MIT License
 */
@EnableConfigServer
@EnableEurekaClient
@SpringBootApplication
public class ObelixConfigServerApplication {

  public static void main(String[] args) {
    SpringApplication.run(ObelixConfigServerApplication.class, args);
  }
}
