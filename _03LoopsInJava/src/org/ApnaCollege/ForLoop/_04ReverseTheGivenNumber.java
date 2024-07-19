// Program to Demonstrate Reverse the given Number

package org.ApnaCollege.ForLoop;

import java.util.Scanner;

public class _04ReverseTheGivenNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n : ");
		int n = sc.nextInt();
		int rev = 0;
		
		while(n > 0) {
			int lastDigit = n % 10;
			n = n/10;
			rev = (rev*10) + lastDigit;
			
//			System.out.println("Reverse of the number is : " + rev);
		}
		
		System.out.println("Reverse of the number is : " + rev);

	}

}
