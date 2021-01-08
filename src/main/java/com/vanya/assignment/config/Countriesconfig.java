package com.vanya.assignment.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Countriesconfig {

	@Bean
	public RestTemplate getRestTemplete() {
		return new RestTemplate();
	}

//	public static void main(String[] args) {
//		SpringApplication.run(Countriesconfig.class, args);
//	}

}
