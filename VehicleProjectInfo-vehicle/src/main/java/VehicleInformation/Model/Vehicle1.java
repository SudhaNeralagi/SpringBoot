package VehicleInformation.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import VehicleInformation.ModelSec.Location;

@Entity
public class Vehicle1 {
	@Id
	private int vehicleId;
	private String vehicleModel;
	private int FuelCapacity;
	private int length;
	private int breadth;
	private int height;

	@ManyToOne
	@JoinColumn(name = "locationId")
	private Location location;

	public Vehicle1() {

	}

	public Vehicle1(int vehicleId, String vehicleModel, int fuelCapacity, int length, int breadth, int height) {
		super();
		this.vehicleId = vehicleId;
		this.vehicleModel = vehicleModel;
		FuelCapacity = fuelCapacity;
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}

	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getVehicleModel() {
		return vehicleModel;
	}

	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}

	public int getFuelCapacity() {
		return FuelCapacity;
	}

	public void setFuelCapacity(int fuelCapacity) {
		FuelCapacity = fuelCapacity;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	public int getHeight() {
		return height;
	}

	
	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public void setHeight(int height) {
		this.height = height;
	}

}
