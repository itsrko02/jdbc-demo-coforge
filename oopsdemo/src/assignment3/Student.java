package assignment3;

public class Student implements Comparable<Student>{

	int rollno,marks;
	String name,course;
	
	
	public Student(int rollno, String name, String course, int marks) {
		this.rollno = rollno;
		this.marks = marks;
		this.name = name;
		this.course = course;
	}


	@Override
	public int compareTo(Student o) {
		if(marks==o.marks)
			return 0;
		else if(marks>o.marks)
			return 1;
		else 
			return -1;
	}
	
	
	
}

