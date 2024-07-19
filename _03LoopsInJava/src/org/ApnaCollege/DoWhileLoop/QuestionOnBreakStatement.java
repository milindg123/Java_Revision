// Keep Entering numbers till user enters a multiple of 10

package org.ApnaCollege.DoWhileLoop;

import java.util.Scanner;

public class QuestionOnBreakStatement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		do {
		System.out.println("Enter your number : ");
		int n = sc.nextInt();
		if(n% 10 == 0) {
			break;
		}
		System.out.println(n);
		}
		
		while(true);
		

	}

}
