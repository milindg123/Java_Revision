package org.ApnaCollege.functions;

import java.util.Scanner;

public class _04FindProductOfAandB {
	
	public static int ProductOfAandB(int A, int B) {
		
		int product = A * B;
		
//		System.out.println("Product of A and B is : " + product);
		return product;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of A : ");
		int A = sc.nextInt();
		System.out.println("Enter the value of B : ");
		int B = sc.nextInt();
		
		// create a new variable to store the result
		int prod = ProductOfAandB(A,B);
		
		// printing that variable which gives the actual result of the product
		System.out.println("Product of A and B is : " + prod);

	}

}
