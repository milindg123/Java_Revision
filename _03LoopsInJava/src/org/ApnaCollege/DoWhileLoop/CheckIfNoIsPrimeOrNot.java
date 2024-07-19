package org.ApnaCollege.DoWhileLoop;

import java.util.Scanner;

public class CheckIfNoIsPrimeOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		
		if(n == 2) {
			System.out.println("Number is Prime");
		}
		for(int i=2; i<=Math.sqrt(n); i++) {
			
			if(n % i == 0) {
				System.out.println("Number is not prime");
			}
			
			else {
				System.out.println("Number is Prime");
			}
		}
	

	}

}
