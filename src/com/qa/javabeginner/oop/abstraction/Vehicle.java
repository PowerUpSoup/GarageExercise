package com.qa.javabeginner.oop.abstraction;

public abstract class Vehicle extends Garage {
	private String terrain;
	private int topSpeed;
	private int maxPassengers;
	
	public Vehicle(String terrain, int topSpeed, int maxPassengers) {
		this.terrain = terrain;
		this.topSpeed = topSpeed;
		this.maxPassengers = maxPassengers;
	}
	
	public abstract void accelerate();
	
	public abstract void applyBreaks();
	
	public abstract void boardPassengers();  

	public String getTerrain() {
		return terrain;
	}

	public void setTerrain(String terrain) {
		this.terrain = terrain;
	}

	public int getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}

	public int getMaxPassengers() {
		return maxPassengers;
	}

	public void setMaxPassengers(int maxPassengers) {
		this.maxPassengers = maxPassengers;
	}
	
	
	
}
