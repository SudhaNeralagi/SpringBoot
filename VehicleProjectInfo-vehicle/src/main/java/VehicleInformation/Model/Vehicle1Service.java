package VehicleInformation.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import  VehicleInformation.Model.Vehicle1;
import VehicleInformation.Model.Vehicle1Repository;
@Service
public class Vehicle1Service {
	@Autowired
	private Vehicle1Repository vehicle1Repository;
	
	public List<Vehicle1> getAllVehicle1(){
		List<Vehicle1> vehicle1=new ArrayList<>();
		vehicle1Repository.findAll()
		.forEach(vehicle1::add);
           return vehicle1;
    }
    
   public Optional<Vehicle1> getVehicle1(int vehicleId) {
     return vehicle1Repository.findById(vehicleId);
   }
   public void addVehicle1(Vehicle1 vehicle1) {
	   vehicle1Repository.save(vehicle1);
    }
   public void updateVehicle1(Vehicle1 vehicle1) {
    	vehicle1Repository.save(vehicle1);
   }
   public void deleteVehicle1(int vehicleId) {
	   vehicle1Repository.deleteById(vehicleId);
    	}
    
}



