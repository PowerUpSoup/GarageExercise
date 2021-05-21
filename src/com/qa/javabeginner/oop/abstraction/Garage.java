package com.qa.javabeginner.oop.abstraction;

import java.util.ArrayList;

public class Garage {
	
	ArrayList<Vehicle> vehicleList = new ArrayList<>();
	
	//Constructor
	public Garage() {
		
	}
	
	public void parkVehicle(Vehicle vehicle) {
		this.vehicleList.add(vehicle);
	}

	@Override
	public String toString() {
		return "Garage [vehicleList=" + vehicleList + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
}
