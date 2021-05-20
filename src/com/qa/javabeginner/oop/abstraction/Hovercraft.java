package com.qa.javabeginner.oop.abstraction;

public class Hovercraft extends Vehicle{
	
	private boolean isPopped; 
	private boolean engaged;
	private boolean onWater;
	
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

	public Hovercraft(String terrain, int topSpeed, int maxPassengers) {
		super(terrain, topSpeed, maxPassengers);
		// TODO Auto-generated constructor stub
	}

}