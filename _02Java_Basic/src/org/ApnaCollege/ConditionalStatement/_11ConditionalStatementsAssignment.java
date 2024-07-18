package org.ApnaCollege.ConditionalStatement;

import java.util.Scanner;

public class _11ConditionalStatementsAssignment {

	public static void main(String[] args) {
	
//		Question 1 : Write a program to get a number from the user 
//					and print whether it is positive or negative
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = sc.nextInt();
		
		if(number>= 0) {
			System.out.println("The number is Positive number");
		}
		
		else {
			System.out.println("The number is Negative number");
		}
		
		
		
		
//		Question 2 : Finish the following code so that it prints You have a Fever 
//		if your temperature is above 100 and otherwise prints You don't have a fever
		
		double temp = 103.5;
		
		if(temp > 100) {
			System.out.println("You have a Fever");
		}
		else {
			System.out.println("You don't have a Fever ");
		}
		

	}

}
