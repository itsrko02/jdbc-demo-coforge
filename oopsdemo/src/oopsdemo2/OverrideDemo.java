package oopsdemo2;


class Bank{

	int getRateofInterest() {
		return 0;
	}
	
	void display() {
		System.out.println("Welcome to the Bank");
	}
}

class SBI extends Bank{
	
	int getRateofInterest() { //method overridden in child class
		return 5;
	}
}

class ICICI extends Bank{
	
	int getRateofInterest() {
		return 7;
	}
}

class Axis extends Bank{
	
	int getRateofInterest() {
		return 6;
	}
}


public class OverrideDemo {

	public static void main(String[] args) {
		
		SBI b1 = new SBI();
		ICICI b2 = new ICICI();
		Axis b3 = new Axis();
		
		b1.display();
		System.out.println("Rate of Interest of SBI is :"+b1.getRateofInterest());
		System.out.println("Rate of Interest of ICICI is :"+b2.getRateofInterest());
		System.out.println("Rate of Interest of Axis is :"+b3.getRateofInterest());

	}

}
