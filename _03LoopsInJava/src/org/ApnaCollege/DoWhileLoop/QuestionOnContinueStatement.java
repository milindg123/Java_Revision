// program for Display all numbers entered by user except multiples of 10 

package org.ApnaCollege.DoWhileLoop;

import java.util.Scanner;

public class QuestionOnContinueStatement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Enter the value of n : ");
			int n = sc.nextInt();
			if(n%10 == 0) {
				continue;
			}
			System.out.println("your number was : " +n);
		}
		
		while(true);

	}

}
