package com.zanatta.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.zanatta.api.config.property.MoneyApiProperty;

@SpringBootApplication
@EnableConfigurationProperties(MoneyApiProperty.class)
public class MoneyApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoneyApiApplication.class, args);
	}
}
//teste