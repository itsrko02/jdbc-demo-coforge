package assignment1;

/*
  1. Write a Java Program to get the following O/p.
			
			*
		  * * *
		* * * * *
	  * * * * * * *
	* * * * * * * * *
	  * * * * * * *
		* * * * *
		  * * *
			*

 */


public class Pattern {

	public static void main(String[] args) {
		
		for(int i=0; i<5; i++) {
			for(int j=5;j>i;j--) {
				System.out.print(" ");
			}
			
			for(int k=0; k<(i*2)-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=5;i>0;i--) {
			for(int j=5;j>i;j--) {
				System.out.print(" ");
			}
			
			for(int k=0;k<(i*2)-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
