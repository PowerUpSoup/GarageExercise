package com.qa.javabeginner.oop.abstraction;

public class Car extends Vehicle {

	private String manufacturer;
	private String model;
	private String dateOfCreation;

	public Car(String terrain, int topSpeed, int maxPassengers, String manufacturer, String model, String doc) {
		super(terrain, maxPassengers, maxPassengers);
		this.manufacturer = manufacturer;
		this.model = model;
		this.dateOfCreation = doc;
	}

	public void accelerate() {
		System.out.println("Pedal is to the metal");
		System.out.println("Dumping NOS");
		System.out.println("Approaching 88 miles per hour, Marty!");
	}

	@Override
	public void applyBreaks() {
		System.out.println("Is that a deer!");
		System.out.println("Hit the breaks!");
		System.out.println("Slowing down.");
	}

	@Override
	public void boardPassengers() {
		System.out.println("Opening Doors...");
		System.out.println("Fastenning seatbelts...");
		System.out.println("Doors closing...");
	}
	
	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getDateOfCreation() {
		return dateOfCreation;
	}

	public void setDateOfCreation(String dateOfCreation) {
		this.dateOfCreation = dateOfCreation;
	}

}
