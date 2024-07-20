// Program to demonstrate the factorial of a number n 


// Example 4! = 1*2*3*4 = 24

package org.ApnaCollege.functions;

import java.util.Scanner;

public class _05FactorialOfNumberN {
	public static int factorial(int n) {
		
		int f = 1;
		
		for(int i=1; i<=n; i++) {
			f = f*i;
		}
		return f;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of the number: ");
		int n = sc.nextInt();
		
		int Fact = factorial(n);
		
		System.out.println("Factorial of a number is : "+ Fact);

	}

}
