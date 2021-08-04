package oopsdemo3;

/*The major use of abstract classes and methods is to achieve abstraction in Java.



Abstraction is an important concept of object-oriented programming that allows us to hide unnecessary 
details and only show the needed information. */


public abstract class Bike {

	Bike(){
		System.out.println("Bike is created");
	}
	
	abstract void run(); // abstract method
	
	
	void changeGear() {	 // instance method
		System.out.println("Gear Changed");
	}
}


class Honda extends Bike{

	@Override
	void run() {
		System.out.println("Honda Bike Running.....");
	}
	
	
}
