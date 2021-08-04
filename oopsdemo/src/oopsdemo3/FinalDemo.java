package oopsdemo3;

final class Hello{
	
	final void display() {
		System.out.println("This is a final method");
	}
}

//final class cannot be extended
/*class World extends Hello { 
	
	//final methods can't be overridden
//	final void display() { 
//		System.out.println("This is a final method");
//	}
}*/


public class FinalDemo {

	public static void main(String[] args) {
		final int AGE=20;
		final float PI=3.142f;
		
//		AGE=30; --compilation error - final variable values cannot be changed
	}

}
