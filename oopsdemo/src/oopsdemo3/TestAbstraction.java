package oopsdemo3;

public class TestAbstraction {

	public static void main(String[] args) {
		
		Bike obj = new Honda();  //upcasting
		
		obj.run();
		obj.changeGear();
		
		
	}

}
