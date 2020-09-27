package com.mc.rest.webservices.restfulwebservicesloans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Bean;

import brave.sampler.Sampler;

@EnableConfigServer
@SpringBootApplication
@EnableDiscoveryClient
public class RestfulWebServicesLoansApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfulWebServicesLoansApplication.class, args);
	}
	
	@Bean
	public Sampler defaultSampler(){
		return Sampler.ALWAYS_SAMPLE;
	}
}