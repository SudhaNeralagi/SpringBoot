package VehicleInformation.ModelSec;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import VehicleInformation.ModelSec.Location;
import VehicleInformation.ModelSec.LocationRepository;
@Service
public class LocationService {
	@Autowired
	private LocationRepository locationRepository;
	
	public List<Location> getAllLocation(){
		List<Location> location=new ArrayList<>();
		locationRepository.findAll()
		.forEach(location::add);
           return location;
    }
    
   public Optional<Location> getLocation(int locationId) {
     return locationRepository.findById(locationId);
   }
   public void addLocation(Location location) {
	  locationRepository.save(location);
    }
   public void updateLocation(Location location) {
    	locationRepository.save(location);
   }
   public void deleteLocation(int locationId) {
	   locationRepository.deleteById(locationId);
    	}
    

}
