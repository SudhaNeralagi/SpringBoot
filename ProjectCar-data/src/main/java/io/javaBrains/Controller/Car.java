package io.javaBrains.Controller;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Car {
	
    @Id
	private String id;
	private String cartype;
	private String modelname;
	private String YoR;
	private String seatCapacity;
	private String costPerDay;
	private String mileage;
	private String pincode; 
	private String contactnumber;
	private String  email; 
		  
	public Car() {}
	
	public Car(String id, String cartype, String modelname, String yoR, String seatCapacity, String costPerDay,
			String mileage, String pincode, String contactnumber, String email) {
		super();
		this.id = id;
		this.cartype = cartype;
		this.modelname = modelname;
		this.YoR = yoR;
		this.seatCapacity = seatCapacity;
		this.costPerDay = costPerDay;
		this.mileage = mileage;
		this.pincode = pincode;
		this.contactnumber = contactnumber;
		this.email = email;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCartype() {
		return cartype;
	}
	public void setCartype(String cartype) {
		this.cartype = cartype;
	}
	public String getModelname() {
		return modelname;
	}
	public void setModelname(String modelname) {
		this.modelname = modelname;
	}
	public String getYoR() {
		return YoR;
	}
	public void setYoR(String yoR) {
		YoR = yoR;
	}
	public String getSeatCapacity() {
		return seatCapacity;
	}
	public void setSeatCapacity(String seatCapacity) {
		this.seatCapacity = seatCapacity;
	}
	public String getCostPerDay() {
		return costPerDay;
	}
	public void setCostPerDay(String costPerDay) {
		this.costPerDay = costPerDay;
	}
	public String getMileage() {
		return mileage;
	}
	public void setMileage(String mileage) {
		this.mileage = mileage;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getContactnumber() {
		return contactnumber;
	}
	public void setContactnumber(String contactnumber) {
		this.contactnumber = contactnumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
		
	}
	



