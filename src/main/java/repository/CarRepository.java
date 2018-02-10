package repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import domain.Car;

public interface CarRepository extends MongoRepository<Car, Integer> {
	
}
