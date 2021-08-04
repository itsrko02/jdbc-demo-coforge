package oopsdemo2;

public class Vehicle {

	void drive() {
		System.out.println("Driving Vehicle");
	}
}

class Car1 extends Vehicle{

	@Override
	void drive() {
		System.out.println("Driving Car");
	}
		
}

class Truck extends Vehicle{

	@Override
	void drive() {
		System.out.println("Driving Truck");
	}
	
	void load() {
		System.out.println("Loading Truck");
	}
}


