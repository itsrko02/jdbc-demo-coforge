package assignment3;

import java.util.ArrayList;
import java.util.Collections;


public class Sort {

	public static void main(String[] args) {
		
		ArrayList<Student> a1 = new ArrayList<Student>();
		
		Student s1 = new Student(101, "Mike", "CSE",70);
		Student s2 = new Student(102, "John", "ECE",80);
		Student s3 = new Student(103, "Mary", "EE",25);
		Student s4 = new Student(104, "Robert", "CSE",23);
		Student s5 = new Student(105, "James", "ECE",56);
		

		a1.add(s2);
		a1.add(s1);
		a1.add(s3);
		a1.add(s5);
		a1.add(s4);
		
		Collections.sort(a1); 
		
		System.out.println("****Students sorted list based on Marks*****");
		System.out.println("\nRollNo.\tName\tCourse\tMarks");
		System.out.println("---------------------------------------------");
		for(Student s:a1) {
			System.out.println(s.rollno+"\t"+s.name+"\t"+s.course+"\t"+s.marks);
		}
		
		
	}

}
