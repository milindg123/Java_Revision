/*
 	Question 1 : Write a java method to compute the average of three numbers
 */

package org.ApnaCollege.functions;

import java.util.Scanner;

public class _15AssignmentQuestion1 {
	public static int AvgOfThreeNo(int a, int b, int c) {
		int avg = (a+b+c)/3;
		
		return avg;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a: ");
		int a = sc.nextInt();
		
		System.out.println("Enter the value of b : ");
		int b = sc.nextInt();
		
		System.out.println("Enter the value of c : ");
		int c = sc.nextInt();
		
		int Average = AvgOfThreeNo(a,b,c);
		System.out.println("Average of three numbers is : " + Average);
	}

}
