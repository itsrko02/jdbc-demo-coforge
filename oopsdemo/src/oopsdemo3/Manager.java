package oopsdemo3;

public class Manager extends Employee {

	String department;
	
	public Manager(String name, double basic, String address, String dept) {
		super(name, basic, address);
		this.department =dept;
	}
	
	void show() {
        super.show();
        System.out.println("Department: \t\t" + department);
    }
	

	@Override
	double totalPay() {
		
		double totalAmount = 0;
        double houseRentAllowance = (basic * 0.08);
        double dearnessAllowance = (basic * 0.3);
        double medicalAllowance = 1500;
        totalAmount = basic + houseRentAllowance
        + dearnessAllowance + medicalAllowance;
        
        return totalAmount;
        
	}
	
	

}
