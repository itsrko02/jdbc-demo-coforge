package newfeatures;

import java.time.LocalDate;

interface MyInterface{
	
	 //abstract method
	public void square(int a);
	
	
	//default method
	default void display(String a) {
		System.out.println("Hello"+a);
	}
	
	
	//static methods
	static void printDate() {
		System.out.println("Todays Date: "+LocalDate.now());
	}
	
}

public class DefaultMethodDemo implements MyInterface {

	
	@Override
	public void square(int a) {
	 System.out.println("The Square of Number is: "+(a*a));
	}

	
	
	public static void main(String[] args) {
		
		DefaultMethodDemo d1 = new DefaultMethodDemo();
		
		d1.square(5);
		
		//call default method in interface
		d1.display("Deafult Method");
		
		//call static method in interface
		MyInterface.printDate();
		
	}

	
}
