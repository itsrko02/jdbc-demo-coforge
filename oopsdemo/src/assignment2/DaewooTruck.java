package assignment2;

public class DaewooTruck implements Truck {

	
	
	private int axles;
	private int totalWeight;
	final static String TRUCKNAME = "Daewoo Truck";
	
	
	public DaewooTruck(int axles, int totalWeight) {
		this.axles = axles;
		this.totalWeight = totalWeight;
	}
	
	@Override
	public int axlesCount() {
		return this.axles;
	}

	@Override
	public int totalWeight() {
		return this.totalWeight;
	}

}
