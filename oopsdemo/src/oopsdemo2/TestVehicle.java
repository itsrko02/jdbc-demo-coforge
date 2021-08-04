package oopsdemo2;


//Dynamic Polymorphism
public class TestVehicle {

	public static void main(String[] args) {

		Vehicle vObj = new Vehicle();
		vObj.drive();
		
		Vehicle vCar = new Car1();  //upcasting
		vCar.drive(); // invoke overridden drive method of car1 class
		
		Vehicle vTruck = new Truck(); //upcasting
		vTruck.drive();
//		vTruck.load();  // compile time error
	
		Truck t1 = new Truck();
		t1.load();

	}

	
}
