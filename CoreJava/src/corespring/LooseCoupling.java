package corespring;

interface Vehicle {
	
	//in java loose coupling achived by interfaces and depedency injection
	
	void move();

}

//class Car implemet Vehicale
class Car implements Vehicle {
	@Override
	public void move() {
		System.out.println("Car is moving.");
	}
	
}

//Bike class implement Vehicle
class Bike implements Vehicle {
	@Override
	public void move() {
		System.out.println("Bike is moving.");
	}
	
}

//Travaller class depends on the vehicale interface not on specific implimention

class Traveler {
	private Vehicle vehicle;
	
	//Setter method to inject the vehicle dependency
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	//Method to start the journey
	public void startJourney() {
		vehicle.move();
	}
}

public class LooseCoupling {
	public static void main(String[] args) {
		//Create the Traveler object
		Traveler traveler = new Traveler();
	}
	
}
