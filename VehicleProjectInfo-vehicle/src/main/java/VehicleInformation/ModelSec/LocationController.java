package VehicleInformation.ModelSec;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import VehicleInformation.ModelSec.Location;
import VehicleInformation.ModelSec.LocationService;
@RestController
public class LocationController {
	@Autowired
	private LocationService locationService;

	@RequestMapping("/location")
	public List<Location> getAllLocation() {              
		 return locationService.getAllLocation();
	
	}
	@RequestMapping(method=RequestMethod.POST,value="/location")
	public void addLocation(@RequestBody Location location) {
		locationService.addLocation(location);
	}

	@RequestMapping(method=RequestMethod.GET,value="/location/{locationId}")
	public Optional<Location> getLocation(@PathVariable int locationId) {
	return locationService.getLocation(locationId);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/location/{locationId}")
	public void updateLocation(@PathVariable int locationId,@RequestBody Location location) {
		locationService.updateLocation(location);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/location/{locationId}")
	public void deleteLocation(@PathVariable int locationId) {
		locationService.deleteLocation(locationId);
	}

}
