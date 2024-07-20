// Program to demonstrate the function syntax with parameters 
/*
 	Parameters : parameters that passed in function definition 
 	  			 it is also called Formal Parameters
 	  			 
 	  		
 	Arguments : Value passed at the time of function calling in the main function is called arguments
 				It is also called Actual Parameters
 
 
 
 */
package org.ApnaCollege.functions;

import java.util.Scanner;

public class _02SyntaxWithParameters {
	
//	Function without parameters 
	public static void printHelloWorld() {
		System.out.println("Hello World");
		System.out.println("Hello World");
	}
	
	
//	Function with parameters 
	public static void calculateSum(int a, int b) { // parameters or formal parameters
		int sum = a + b;
		System.out.println("Sum is : " + sum);
	}
	
//	Function return type change void --> int
	public static int calculateSum2(int num1, int num2) {
		int sum2 = num1 + num2;
		return sum2;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum2 = calculateSum2(a,b); // arguments or actual parameters 
		
		System.out.println("Sum is : " + sum2);
		calculateSum2(a, b);
		calculateSum(a, b); // Function call

	}

}
