// Program to demonstrate the Binomial Coefficient

package org.ApnaCollege.functions;

import java.util.Scanner;

public class _06BinomialCoeff {
	public static int factorial(int n) {
		int f = 1;
		
		for(int i=1; i<=n; i++) {
			f= f*i;
		}
		return f;
	}
	
	
	public static int BinCoeff(int n, int r) {
		int n_fact = factorial(n);
		int r_fact = factorial(r);
		int nmr_fact = factorial(n-r);
		
		int BinCoeff = n_fact/(r_fact * nmr_fact);
		
		return BinCoeff;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n : ");
		int n = sc.nextInt();
		System.out.println("Enter the value of r : ");
		int r = sc.nextInt();

		int BinomialCoeff = BinCoeff(n, r);
//		System.out.println("Factorial of number n is : " + fact);
		System.out.println("Binomial coefficient is : " +BinomialCoeff);

	}

}
