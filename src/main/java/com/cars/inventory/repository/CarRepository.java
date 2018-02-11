package com.cars.inventory.repository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.cars.inventory.domain.Car;


public interface CarRepository extends MongoRepository<Car, Integer> {
	
}
