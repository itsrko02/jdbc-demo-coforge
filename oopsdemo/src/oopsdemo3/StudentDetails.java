package oopsdemo3;


// multiple interface implementation - multiple inheritance
public class StudentDetails implements CollegeData,HostelData {

	College c1 = new College("Mary",500,"Delhi University","MCA");

	Hostel h1 = new Hostel("Ram","Bloack A");
	
	
	@Override
	public void collegeDetail() {
		System.out.println("******College Details********");
		
		System.out.println("College Name :"+c1.getName());
		System.out.println("College Id :"+c1.getId());
//		System.out.println("Course :"+c1.getCourse());
		System.out.println("University :"+c1.getUniversity());
	
	
	}

	@Override
	public void studentData() {
		System.out.println("Students can Join courses : MCA, MTech, BCA, BTech");
	
	} 
		
	

	@Override
	public void hostelDetail() {
		System.out.println("******Hostel Details********");
	
		System.out.println("Hostel Name :"+h1.getName());
		System.out.println("Location :"+h1.getLocation());
	}

	
	@Override
	public void studentRecords() {
	System.out.println("Students selected based on Percetage & Finacial Situation");
	
	}

public static void main(String[] args) {
	
	StudentDetails s1 = new StudentDetails();
	
	s1.collegeDetail();
	s1.studentData();
	s1.hostelDetail();
	s1.studentRecords();
	
}

}
