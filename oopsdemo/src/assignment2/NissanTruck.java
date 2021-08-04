package assignment2;

public class NissanTruck implements Truck{

	private int axles;
	private int totalWeight;
	final static String TRUCKNAME = "Nissan Truck";
	
	public NissanTruck(int axles, int totalWeight) {
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
