package assignment2;

public class FordTruck implements Truck{
	
	private int axles;
	private int totalWeight;
	final static String TRUCKNAME = "Ford Truck";
	
	
	public FordTruck(int axles, int totalWeight) {
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
