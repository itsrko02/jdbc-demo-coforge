package assignment1;

import java.util.Scanner;

/*
  Write a program by creating an 'Employee1' class having the following methods and print the final salary.
	1 - 'getInfo()' which takes the salary, number of hours of work per day of employee as parameter
	2 - 'AddSal()' which adds $10 to salary of the employee if it is less than $500.
	3 - 'AddWork()' which adds $5 to salary of employee if the number of hours of work per day is more than 6 hours.
 */

public class Employee1 {
	
	int salary,workHours;
	

	void getInfo(int s, int h) {
		salary =s;
		workHours= h;
	}
	
	void addSal() {
		if(salary<500) {
			salary = salary+10;
		}
	}
	
	void addWork() {
		if(workHours>6) {
			salary = salary+5;
		}
	}
	
	void displaySalary(){
		System.out.println("Total Salary :"+salary);
	}

	public static void main(String[] args) {
		int sal,hrs;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter salary of the employee :");
		sal = s.nextInt();
		System.out.println("Enter working hours of the employee :");
		hrs = s.nextInt();
		
		
		Employee1 e = new Employee1();
		e.getInfo(sal, hrs);
		e.addSal();
		e.addWork();
		e.displaySalary();
		

		s.close();
	}

}
