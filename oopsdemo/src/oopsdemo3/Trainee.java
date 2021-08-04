package oopsdemo3;

public abstract class Trainee {

	private String name;
    private String address;
    private int number;
	
    public Trainee(String name, String address, int number) {
		this.name = name;
		this.address = address;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
    
    
	public abstract double calculateMarks();
	
	void show() {
		System.out.println("Display marks for :"+this.name+" "+this.address);
	}

	@Override
	public String toString() {
		return "Trainee [name=" + name + ", address=" + address + ", number=" + number + "]";
	}
	
	
    
    
}
