package org.ApnaCollege.BasicJava;

import java.util.Scanner;

public class _06_ProductOfTwoNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first No.: ");
		int a = sc.nextInt();
		
		System.out.println("Enter the second No.: ");
		int b = sc.nextInt();
		
		System.out.println("Product of two numbers are : ");
		int product = a*b;
		
		System.out.println(product);

	}

}
