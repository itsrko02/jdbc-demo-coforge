package newfeatures;

public class Employee {

	String name;

	public Employee(String name) {
		this.name = name;
	}
	
	public static int nameCompare(Employee a1, Employee a2)
    {
       return a1.name.compareTo(a2.name);
     }

	@Override
	public String toString() {
		return "Employee [name=" + name + "]";
	}
	
	
}
