package io.javaBrains.Controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {
	@Autowired
	private CarRepository carRepository;
	
	public List<Car> getAllCar(){
		List<Car> vehicle=new ArrayList<>();
		carRepository.findAll()
		.forEach(vehicle::add);
           return vehicle;
    }
    
   public Optional<Car> getCar(String id) {
     return carRepository.findById(id);
   }
   public void addCar(Car vehicle) {
	   carRepository.save(vehicle);
    }
   public void updateCar(Car topic) {
    	carRepository.save(topic);
   }
   public void deleteCar(String id) {
	   carRepository.deleteById(id);
    	}
    
}
