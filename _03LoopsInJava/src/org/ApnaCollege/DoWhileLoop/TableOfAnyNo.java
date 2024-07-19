//		Question 2 : Write a program to print the multiplication table of a number N,
//					 entered by the user
		

package org.ApnaCollege.DoWhileLoop;

import java.util.Scanner;

public class TableOfAnyNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		
//		int table = 1;
		for(int i=1; i<=10; i++) {
			
//			table = n * i;
//			System.out.println(table);
			
			//Another approach
			System.out.println(n + " * " + i + " = " + n*i);
		}
		

	}

}
