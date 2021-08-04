package assignment1;

import java.util.Scanner;

/*
 * 3. Write a program to print the area of a rectangle by creating a class named 'Area' 
 * 	  taking the values of its length and breadth as parameters of its method and having a 
 * 	  method named 'returnArea' which returns the area of the rectangle. 
 * 	  Length and breadth of rectangle are entered through keyboard.
 */

public class Area {
	
	int len, bre;
	
	public Area(int len, int bre) {
		this.len = len;
		this.bre = bre;
	}

	int returnArea(int l, int b) {
		len =l;
		bre = b;
		return len * bre;
	}
	
	public static void main(String[] args) {
		int l,b;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the length :");
		l = s.nextInt();
		System.out.println("Enter the breadth :");
		b = s.nextInt();
		
		Area a = new Area(l,b);
		System.out.println("Area of a Rectangle :"+a.returnArea(l, b));
		
		s.close();

	}

}
