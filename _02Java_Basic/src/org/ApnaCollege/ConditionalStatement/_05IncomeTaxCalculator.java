// Program to demonstrate the income tax calculator 

package org.ApnaCollege.ConditionalStatement;

import java.util.Scanner;

public class _05IncomeTaxCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tax= 0;
		System.out.println("Enter the income : ");
		int income = sc.nextInt();
		
		if(income< 500000) {
			tax = (0*income);
		}
		
		else if(income>= 500000 && income < 1000000) {
			tax = (int)(0.2*income);
		}
		
		else if(income > 1000000) {
			tax = (int)(0.3*income);
		}
		
		else {
			System.out.println("Wrong input");
		}
		
		
		System.out.println("The tax is : " + tax);

	}

}
