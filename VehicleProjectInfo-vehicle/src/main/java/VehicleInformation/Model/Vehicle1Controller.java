package VehicleInformation.Model;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;

import VehicleInformation.Model.Vehicle1;
import VehicleInformation.Model.Vehicle1Service;


@RestController
public class Vehicle1Controller {
	
	 @Autowired
		private Vehicle1Service vehicle1Service;

		@RequestMapping("/vehicle1")
		public List<Vehicle1> getAllVehicle1() {
			 return vehicle1Service.getAllVehicle1();
		
		}
		@RequestMapping(method=RequestMethod.POST,value="/vehicle1")
		public void addVehicle1(@RequestBody Vehicle1 vehicle1) {
			vehicle1Service.addVehicle1(vehicle1);
		}
	
		@RequestMapping(method=RequestMethod.GET,value="/vehicle1/{vehicleId}")
		public Optional<Vehicle1> getVehicle1(@PathVariable int vehicleId) {
		return vehicle1Service.getVehicle1(vehicleId);
		}
		
		@RequestMapping(method=RequestMethod.PUT,value="/vehicle1/{vehicleId}")
		public void updateVehicle1(@PathVariable int vehicleId,@RequestBody Vehicle1 vehicle1) {
			vehicle1Service.updateVehicle1(vehicle1);
		}
		@RequestMapping(method=RequestMethod.DELETE,value="/vehicle1/{vehicleId}")
		public void deleteVehicle1(@PathVariable int vehicleId) {
			vehicle1Service.deleteVehicle1(vehicleId);
		}


}
