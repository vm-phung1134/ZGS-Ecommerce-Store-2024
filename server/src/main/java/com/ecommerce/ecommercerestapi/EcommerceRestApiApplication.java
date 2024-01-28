package com.ecommerce.ecommercerestapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class EcommerceRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceRestApiApplication.class, args);
	}

}
