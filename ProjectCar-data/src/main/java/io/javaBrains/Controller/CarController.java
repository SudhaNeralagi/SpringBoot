package io.javaBrains.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {
	
    @Autowired
	private CarService carService;

	@RequestMapping("/car")
	public List<Car> getAllCar() {
		 return carService.getAllCar();
	
	}
	@RequestMapping(method=RequestMethod.POST,value="/car")
	public void addCar(@RequestBody Car topic) {
		carService.addCar(topic);
	}
	@RequestMapping("/car/{id}")
	public Optional<Car> getCar(@PathVariable String id) {
	return carService.getCar(id);
	}
	@RequestMapping(method=RequestMethod.PUT,value="/car/{id}")
	public void updateCar(@PathVariable String id,@RequestBody Car topic) {
		carService.updateCar(topic);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/car/{id}")
	public void deletCar(@PathVariable String id) {
		carService.deleteCar(id);
	}

}
