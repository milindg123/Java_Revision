// Print the largest of three numbers 

package org.ApnaCollege.ConditionalStatement;

public class _06PrintTheLargestOfThreeNo {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 25;
		int c = 5;
		
		if( a>= b && a>=c) {
			System.out.println("Largest is A ");
		}
		else if(b>=c) {
			System.out.println("largest is B");
		}
		else {
			System.out.println("Largest is c");
		}

	}

}
