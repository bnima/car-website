package com.cars.inventory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.cars.inventory.controller","com.cars.inventory.domain","com.cars.inventory.repository"})
public class CarInventoryWebsiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarInventoryWebsiteApplication.class, args);
	}
}
