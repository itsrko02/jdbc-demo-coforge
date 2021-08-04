package oopsdemo3;

public class Marks extends Trainee {

	
	private double marks;
	
	public Marks(String name, String address, int number, double m) {
		super(name, address, number);
		this.marks=m;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	
	
	@Override
	public double calculateMarks() {
		System.out.println("Calculate Marks");
		return (marks*2);
	}

	
	

}
