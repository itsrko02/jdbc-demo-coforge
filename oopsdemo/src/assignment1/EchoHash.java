package assignment1;

import java.util.Scanner;

/*
 * Write a Java application which reads bytes from the keyboard until encountering 
 * the # character. Echo each character to the screen as it is read. 
 * Terminate the program when the user enters the # character.
 */
public class EchoHash {

	public static void main(String[] args) {
		
		char c;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any character to continue and # to terminate");

		
		do {
			c=s.next().charAt(0);
			System.out.println(c);
			
		} while(c!='#');
		
		System.out.println("Program Terminated!");
		s.close();

	}

}
