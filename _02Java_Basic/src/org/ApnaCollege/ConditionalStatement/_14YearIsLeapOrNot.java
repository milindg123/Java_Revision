package org.ApnaCollege.ConditionalStatement;

import java.util.Scanner;

public class _14YearIsLeapOrNot {

	public static void main(String[] args) {
//		Question : Write a java program that takes a year from the user and print whether that year is leap year or not

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year : ");
		int year = sc.nextInt();
		
		if(year % 4 == 0) {
			System.out.println("Year is leap year");
			
		}
		
		else if(year % 100 == 0) {
			System.out.println("Year is leap year");
		}
		
		else if(year % 400 == 0) {
			System.out.println("Year is leap year ");
		}
		
		else {
			System.out.println("Year is not leap year");
		}
	}

}
