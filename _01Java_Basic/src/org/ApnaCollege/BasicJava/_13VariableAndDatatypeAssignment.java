package org.ApnaCollege.BasicJava;

import java.util.Scanner;

public class _13VariableAndDatatypeAssignment {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
/*
 	Question 1: In a program input 3 numbers: A,B and C. You have to output the average of these 3 numbers
 */

		System.out.println("Enter the value of A : ");
		int A = sc.nextInt();
		
		System.out.println("Enter the value of B : ");
		int B = sc.nextInt();
		
		System.out.println("Enter the value of C : ");
		int C = sc.nextInt();
		
		float avg = (A+B+C)/3;
		
		System.out.println("Average of 3 numbers is : " + avg);
		
		
		
//		Question 2 : In a program input the side of a square. You have to output the area of the square
		
		System.out.println("Enter the value of the side of the square: ");
		int side = sc.nextInt();
		
		float areaOfSquare = side * side;
		System.out.println("Area of the square is : " + areaOfSquare);
	}

}
