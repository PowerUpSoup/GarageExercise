package com.qa.javabeginner.oop.abstraction;

public class Hovercraft extends Vehicle {

	private boolean isPopped;
	private boolean engaged;
	private boolean onWater;

	public Hovercraft(String terrain, int topSpeed, int maxPassengers, boolean isPopped, boolean engaged,
			boolean onWater) {
		super(terrain, topSpeed, maxPassengers);
		this.engaged = engaged;
		this.isPopped = isPopped;
		this.onWater = onWater;
	}

	@Override
	public void accelerate() {
		System.out.println("getting going");
		System.out.println("filling all these in is exhausting");
	}

	@Override
	public void applyBreaks() {
		System.out.println("and tedious!");

	}

	@Override
	public void boardPassengers() {
		System.out.println("well I'm done with it");
	}

	public boolean isPopped() {
		return isPopped;
	}

	public void setPopped(boolean isPopped) {
		this.isPopped = isPopped;
	}

	public boolean isEngaged() {
		return engaged;
	}

	public void setEngaged(boolean engaged) {
		this.engaged = engaged;
	}

	public boolean isOnWater() {
		return onWater;
	}

	public void setOnWater(boolean onWater) {
		this.onWater = onWater;
	}

	@Override
	public String toString() {
		return "Hovercraft [isPopped=" + isPopped + ", engaged=" + engaged + ", onWater=" + onWater + ", getTerrain()="
				+ getTerrain() + ", getTopSpeed()=" + getTopSpeed() + ", getMaxPassengers()=" + getMaxPassengers()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}