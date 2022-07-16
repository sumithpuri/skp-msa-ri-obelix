package com.obelix.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * <h1>Obelix - Microservices Reference Implementation - Discovery Server</h1>
 * 
 * @author Sumith Puri
 * @version 1.0
 * @since 01-06-2020
 * @see Adapted from the Spring Pet Clinic Sample, https://github.com/spring-petclinic/spring-petclinic-microservices
 * 
 * Copyright <a href='https://www.sumithpuri.xyz'>Sumith Puri</a> (c) 2022, Under MIT License
 */
@EnableEurekaServer
@SpringBootApplication
public class ObelixDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ObelixDiscoveryServerApplication.class, args);
	}
}
