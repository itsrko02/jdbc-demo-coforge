package assignment1;

/*
   2. Write a program that would print the information (name, year of joining, salary, address)
	  of three employees by creating a class named 'Employee'. 
	  The output should be as follows:
	  
	    Name         Year of joining        Address
	   Robert            1994           64C- WallsStreet
	   Sam               2000           68D- WallsStreet
	   John              1999           26B- WallsStreet 
		
 */

public class Employee {
	
	int yoj;
	String name, address;
	int salary;
	
	

	public Employee(String name, int yoj, int salary, String address) {
		this.yoj = yoj;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}
	
	void display() {
		System.out.println(name+"\t\t"+yoj+"\t\t\t"+salary+"\t\t"+address);
	}



	public static void main(String[] args) {
		Employee e1 = new Employee("Robert",1994,80000,"64C- WallsStreet");
		Employee e2 = new Employee("Sam",2000,30000,"68D- WallsStreet");
		Employee e3 = new Employee("John",1999,50000,"26B- WallsStreet");
		
		System.out.println("Name\t\tYear of Joining\t\tSalary\t\tAddress");
		e1.display();
		e2.display();
		e3.display();

	}

}
