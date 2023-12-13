package com.example.demoserviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/*************************************Eureka Server****************************************************************************
 * Service discovery and service registry is important in microservices , cauze we have multiple services and need a mechanism 
 * to call another microservices without hardcoding their hostnames and ports
 *  
 * In Cloud Environment service instances may come up and go down anytime.So we need some automatic service registration 
 * and discovery mechanism  
 * 
 * By default Eureka server is also a Eureka Client and need atleast one service URL to locate a peer.
 * 
 * Ae we are going to have a single Eureka Server Node , wE are going to disable it in .properties file 
 * We are going to  use Spring Cloud Netflix Eureka for that 
 * @author saba 
 *
 ******************************************************************************************************************************/
@SpringBootApplication
@EnableEurekaServer
public class DemoServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoServiceRegistryApplication.class, args);
	}

}
