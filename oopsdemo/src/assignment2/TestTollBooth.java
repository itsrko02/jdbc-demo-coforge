package assignment2;

public class TestTollBooth {

	public static void main(String[] args) {
		
		TollBooth booth = new AlleghenyTollBooth();
		
		Truck ford = new FordTruck(5,12500);
		Truck nissan = new NissanTruck(2,5000);
		Truck daewoo = new DaewooTruck(6,17000);
		
		System.out.println("Welcome to Alleghany TollBooth");
		System.out.println();
		
		System.out.println("Arrival of "+FordTruck.TRUCKNAME);
		booth.calculateToll(ford);
		booth.displayData();
		System.out.println();
		
		System.out.println("Arrival of "+NissanTruck.TRUCKNAME);
		booth.calculateToll(nissan);
		booth.displayData();
		System.out.println();
		
		System.out.println("Arrival of "+DaewooTruck.TRUCKNAME);
		booth.calculateToll(daewoo);
		booth.displayData();
		System.out.println();
		
		booth.resetReceipt();

	}

}
