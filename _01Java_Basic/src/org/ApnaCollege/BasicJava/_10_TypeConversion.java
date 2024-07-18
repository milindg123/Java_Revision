package org.ApnaCollege.BasicJava;

import java.util.Scanner;

public class _10_TypeConversion {

	public static void main(String[] args) {
//		byte-> short-> int ->float->long->double
		
		int a = 25;
		long b = a;
//		int a = b;
		System.out.println(b);
		
		 
		
		
		
//		Types compatible conditions
		
//		1. type compatible
//		2. Destination type > source type
		
//		byte-> short->int->float->long->double
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		float number = sc.nextInt();
		System.out.println(number);
	}

}
