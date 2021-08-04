package assignment2;

public class AlleghenyTollBooth implements TollBooth{
	
	private int totalCollectionOfDay;
	private int totalTruckPassed;
	
	public AlleghenyTollBooth(){
		totalCollectionOfDay = 0;
		totalTruckPassed = 0;
	}
	

	@Override
	public void calculateToll(Truck truck) {
		int axles = truck.axlesCount();
		int totalWeight = truck.totalWeight();
		int tollDue = 5*axles + 10*(totalWeight/500);
		
		System.out.println("Truck Arrival - Axles :"+axles+", Total Weight :"+totalWeight
				+"Kg, Toll Due :$"+tollDue);
		totalCollectionOfDay = totalCollectionOfDay + tollDue;
		totalTruckPassed = totalTruckPassed + 1;
		
	}

	@Override
	public void displayData() {
		System.out.println("*******Collecting Receipts*******");
		System.out.println("Total since the last collection - Receipts :$"
				+totalCollectionOfDay+", Trucks :"+totalTruckPassed);
		
	}

	@Override
	public void resetReceipt() {
		System.out.println();
		System.out.println("*******Reset Receipts*********");
		totalCollectionOfDay = 0;
		totalTruckPassed = 0;
		System.out.println("Resetting the Receipts - Receipts :$"
				+totalCollectionOfDay+", Trucks :"+totalTruckPassed);
		
	}
	

}
