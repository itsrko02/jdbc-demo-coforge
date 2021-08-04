package assignment3;

import java.util.ArrayList;
import java.util.Collections;

public class DifferentOperations {

	public static void main(String[] args) {
		
ArrayList<Student> a1 = new ArrayList<Student>();
		
		Student s1 = new Student(101, "Mike", "CSE",70);
		Student s2 = new Student(102, "John", "ECE",80);
		Student s3 = new Student(103, "Mary", "EE",25);
		Student s4 = new Student(104, "Robert", "CSE",23);
		Student s5 = new Student(105, "James", "ECE",56);
		
		//add operation
		a1.add(s2);
		a1.add(s1);
		a1.add(s3);
		a1.add(s5);
		a1.add(s4);
		
		
		//search operation
//		int pos=Collections.binarySearch();
//	    System.out.println("The position of  in Arraylist is :"+pos);
//	    
		
	}

}
