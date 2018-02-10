package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import domain.Car;
import repository.CarRepository;

@RestController
@RequestMapping("/rest/cars")
public class CarController {

	@Autowired
    private CarRepository carsRepository;
	
	@GetMapping("/all")
    public List<Car> getAll() {
        return carsRepository.findAll();
    }
	
	@PostMapping(path = "/create", consumes = "application/json", produces = "application/json")
	public void addCar(@RequestBody Car car) {
		carsRepository.save(new Car(car.getId(),car.getColor(),car.getModel(),car.getPrice(),car.getYear()));
	}
}
