package com.qa.javabeginner.oop.abstraction;

public class Runner {

	public static void main(String[] args) {
		
		Garage garage = new Garage();
		Car car = new Car("street", 100, 5, "Toyota", "Prius", "yesterday");
		DuneBuggy duneBuggy = new DuneBuggy("sand", 65, 3, false, "150cc", "TODAY");
		Hovercraft hoverCraft = new Hovercraft("amphibious", 300, 12, false, false, false);
		
	
		garage.parkVehicle(car);
		garage.parkVehicle(duneBuggy);
		garage.parkVehicle(hoverCraft);
		
		System.out.println(garage);
	}
	
	
	
}
