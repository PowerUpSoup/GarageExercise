package com.qa.javabeginner.oop.abstraction;

public class DuneBuggy extends Vehicle {

	private Boolean isFlipped;
	private String engineSize;
	private String lastRepaired;
	
	public DuneBuggy(String terrain, int topSpeed, int maxPassengers, Boolean isFlipped, String engineSize, String lastRepaired) {
		super(terrain, topSpeed, maxPassengers);
		this.isFlipped = isFlipped;
		this.engineSize = engineSize;
		this.lastRepaired = lastRepaired;
	}

	@Override
	public void accelerate() {
		System.out.println("engaging motor...");
		System.out.println("you went too fast and flipped it");
		setIsFlipped(true);
	}



	@Override
	public void applyBreaks() {
		boolean a = getIsFlipped();
		if (a = true) {
			System.out.println("too late for that pal...");
		} else {
			System.out.println("Slowing down");
		}
	}



	@Override
	public void boardPassengers() {
		System.out.println("there are no doors to open...");
		System.out.println("are you sure this is safe?");
		System.out.println("there are no doors to close...");
	}


	public Boolean getIsFlipped() {
		return isFlipped;
	}

	public void setIsFlipped(Boolean isFlipped) {
		this.isFlipped = isFlipped;
	}

	public String getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(String engineSize) {
		this.engineSize = engineSize;
	}

	public String getLastRepaired() {
		return lastRepaired;
	}

	public void setLastRepaired(String lastRepaired) {
		this.lastRepaired = lastRepaired;
	}

	@Override
	public String toString() {
		return "DuneBuggy [isFlipped=" + isFlipped + ", engineSize=" + engineSize + ", lastRepaired=" + lastRepaired
				+ ", getTerrain()=" + getTerrain() + ", getTopSpeed()=" + getTopSpeed() + ", getMaxPassengers()="
				+ getMaxPassengers() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
}



	