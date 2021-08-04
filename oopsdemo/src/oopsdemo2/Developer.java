package oopsdemo2;

public class Developer extends Employee {  // child class - Inheritance

	
	String technology;
	public Developer(int empId, String name,String tech) {
		super(empId, name); //invoke base class constructor		
		this.technology=tech;
	}
	
	void display1()
	{
		System.out.println("Technology Used: " +technology);
	}

}
