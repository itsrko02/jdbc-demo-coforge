package assignment;

import java.util.Scanner;


public class EmployeeCRUD {

	public static void main(String[] args) {

		Employee e=new Employee();
		String city=null,name=null,contactno=null;
		int cityId=0;
		int eid=0;;

		System.out.println("************** Global Tech Solutions **************");
		System.out.println("----------- Employee Management System ----------");
		while(true)
		{
			System.out.println();
			System.out.println("Press 1 to Add New Employee \t\t Press 2 to Display Employees");
			System.out.println("Press 3 to Update Employee Details \t Press 4 to Delete Employee");
			System.out.println("Press 5 to Exit"); 

			Scanner s=new Scanner(System.in);
			int option=s.nextInt();

			switch(option)
			{
			case 1: System.out.println("************Inserting New Employee*************");
//					System.out.println("Enter Name, City & Contact no. of New Employee :");
		
					Scanner insertScanner = new Scanner(System.in);
					System.out.println("Enter employee name: ");
					name = insertScanner.next();
					System.out.println("Choose city id of the employee: ");
					System.out.println("[1-Delhi]\n[2-Mumbai]\n[3-Bangalore]\n[4-Chennai]\n[5-Noida]\n");
					cityId = insertScanner.nextInt();
					System.out.println("Enter contact no: ");
					contactno = insertScanner.next();
		
					e.insertEmployee(name,cityId,contactno);
					break;

			case 2: e.getEmployee();
					break;

			case 3: System.out.println("************Updating Employee's Record*************");
					Scanner updateScanner = new Scanner(System.in);		
					System.out.println("Enter EmpId to update record of the employee:");
					eid = updateScanner.nextInt();
					System.out.println("Enter new city id: ");
					System.out.println("[1-Delhi]\n[2-Mumbai]\n[3-Bangalore]\n[4-Chennai]\n[5-Noida]\n");
					
					cityId = updateScanner.nextInt();
					e.updateEmployee(eid,cityId);
					break;

			case 4: System.out.println("****************Deleting Employee*******************");
					System.out.println("Enter the EmployeeId of the employee to be deleted: ");
		
					Scanner deleteScanner = new Scanner(System.in);
					eid=deleteScanner.nextInt();
					e.deleteEmployee(eid);
					break;
			case 5: System.out.println("Application Terminated");
					System.exit(0);

			default: System.out.println("Invalid Selection");
					 break;
			}
			

		}

	}

}
