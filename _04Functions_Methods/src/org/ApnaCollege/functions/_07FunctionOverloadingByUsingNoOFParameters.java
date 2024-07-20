/* Program to demonstrate the function overloading by using the number of parameters
 
 	Function Overloading : Multiple function with same name but different parameters
 	
 	for ex. multiply(int a, int b)
 			multiply(float a, float b)
 			multiply(int a, int b, int c,)
 			
 			two Important things'::::
 			1) data types of parameters 
 			2) No. of parameters we passed
 			
 			
 			Function overloading do not depend on return type of the function
 */



package org.ApnaCollege.functions;

import java.util.Scanner;

public class _07FunctionOverloadingByUsingNoOFParameters {
	
//	function overloading by using the number of parameters
	
	
	// func to calc sum of two number
	public static int sum(int a, int b) {
		return a+b;
	}

	// func to cal sum of three number
	public static int sum(int a, int b, int c) {
		return a+b+c;
	}
	
	
	public static void main(String[] args) {
		
		// by directly passing the values of a, b, c
		System.out.println(sum(10, 5));
		System.out.println(sum(5,10,8));
		
		
		
		
//		Values of a,b,c taken from user input
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value of a : ");
		int a = sc.nextInt();
		
		System.out.println("Enter the value of b : ");
		int b = sc.nextInt();
		
		// call func to calc sum of two number
		int sum =sum(a, b);
		System.out.println("Sum of two number is : " + sum);
		
		
		System.out.println("Enter the value of c : ");
		int c = sc.nextInt();
		
		// call func to cal sum of three number
		int sum2 = sum(a,b,c);
		System.out.println("Sum of three number is : " + sum2);
		

		

	}

}
