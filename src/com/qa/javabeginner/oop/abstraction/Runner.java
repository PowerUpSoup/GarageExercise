package com.qa.javabeginner.oop.abstraction;

import java.util.ArrayList;

public class Runner {

	public static void main(String[] args) {
		ArrayList<Garage> garage = new ArrayList<>();
		
		Car car = new Car("street", 100, 5, "Toyota", "Prius", "yesterday");
		DuneBuggy duneBuggy = new DuneBuggy("sand", 65, 3, false, "150cc", "TODAY");
		Hovercraft hoverCraft = new Hovercraft("amphibious", 300, 12, false, false, false);
		
	
		garage.add(car);
		garage.add(duneBuggy);
		garage.add(hoverCraft);
		
		System.out.println(garage);
	}
	
	
	
}
