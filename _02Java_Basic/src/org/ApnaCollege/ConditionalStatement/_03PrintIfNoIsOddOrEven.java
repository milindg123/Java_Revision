package org.ApnaCollege.ConditionalStatement;

import java.util.Scanner;

public class _03PrintIfNoIsOddOrEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		
		if(n%2 == 0) {
			System.out.println("The number n is even number");
		}
		
		else {
			System.out.println("The number n is odd number");
		}

	}

}
