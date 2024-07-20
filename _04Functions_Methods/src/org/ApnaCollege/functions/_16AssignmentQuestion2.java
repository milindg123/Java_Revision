/*
 	
 	Question 2: Write a method named isEven that accepts an int argument. 
 				The method should return true if the argument
 	
 	
 */

package org.ApnaCollege.functions;

import java.util.Scanner;

public class _16AssignmentQuestion2 {
	public static boolean isEven(int n) {
		
		boolean isEven = false;
		for(int i=0; i<=n; i++) {
			if(n%2 == 0) {
				isEven = true;
			
			}
		
		}
		
		if(isEven == true) {
			System.out.println("The number is even");
		}
		else {
			System.out.println("The number is not even");
		}

		
		return true;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		
		isEven(n);
		
//		System.out.println("the number is even : " + Even);
	}

}
