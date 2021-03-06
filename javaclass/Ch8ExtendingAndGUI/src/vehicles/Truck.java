/*
 * Programmer: Jeffrey Meng
 * Date: Jan 23, 2018
 * Purpose:
 */

package vehicles;

public class Truck extends Vehicle {
	protected int towingWeight, cargoArea, wheels, originalPrice;

	// towing weight in lbs
	// cargo area in ft3
	// originalPrice in $.

	public Truck() {

		super();//use super defaults
		this.towingWeight = 10000;
		this.cargoArea = 1000;
		this.wheels = 6;
		this.originalPrice = 90000;

	}

	public Truck(String manufacturer, int year, int doors, int passengers,
			int towingWeight, int cargoArea, int wheels, int originalPrice) {

		super(manufacturer, year, doors, passengers);
		this.towingWeight = towingWeight;
		this.cargoArea = cargoArea;
		this.wheels = wheels;
		this.originalPrice = originalPrice;

	}
	public void DisplayInfo() {
		super.displayInfo();
		System.out.println("Towing Weight: " + towingWeight);
		System.out.println("CargoArea " + cargoArea);
		System.out.println("Wheels: " + wheels);
		System.out.println("Origional Price: " + originalPrice);
	}
	public int getTowingWeight() {
		return towingWeight;
	}

	public void setTowingWeight(int towingWeight) {
		this.towingWeight = towingWeight;
	}

	public int getCargoArea() {
		return cargoArea;
	}

	public void setCargoArea(int cargoArea) {
		this.cargoArea = cargoArea;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public int getOrigionalPrice() {
		return originalPrice;
	}

	public void setOrigionalPrice(int origionalPrice) {
		this.originalPrice = origionalPrice;
	}

	public double getValue(int currentYear) {
		double value = originalPrice * 0.85;//as soon as you purchase, the value goes down by 15%
		value = value * Math.pow((0.85), currentYear - year);
		
		
		return value;
	}
	

}
