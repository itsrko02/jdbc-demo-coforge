package exceptionsdemo;

public class ThrowExample {

	public static void checkEligiblity(int age, int weight) {
		if(age<12 && weight<40) {
			throw new ArithmeticException("Student is not eligible for registration");
		}
		else {
			System.out.println("Student with age :"+age+" "+" and weight :"+weight+" is Eligible");
		}
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to sports eligiblity process..");
		checkEligiblity(20, 45);
		System.out.println("Thank You");
		checkEligiblity(10, 39);
	}

}
