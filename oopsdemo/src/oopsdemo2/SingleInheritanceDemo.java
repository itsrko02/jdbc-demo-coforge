package oopsdemo2;

public class SingleInheritanceDemo {

	public static void main(String[] args) {
		
		Developer d1=new Developer(101,"James Gosling","JDBC");
		Developer d2=new Developer(105,"Jhonsan","spring frameworkC");
		
		Accountant a1 =new Accountant(201,"Gaurav Sharma", "Process salary of Employee","SAP");
		Accountant a2 =new Accountant(205,"Gaurav Sharma", "Process salary of Employee","SAP");
		
		d1.display();// child class object involve parent class method
		d1.display1();// child class method involve child class ,ethod

		d2.display();
		d2.display1();
		
		
		//invoke accountant class methods;
		a1.display();
		a2.display();
	}

}
