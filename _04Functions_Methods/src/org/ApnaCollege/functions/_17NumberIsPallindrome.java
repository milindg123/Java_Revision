/* Program to demonstrate the number is Palindrome or not


	Question : Write a Java program to check if a number is a palindrome in java?
			ex. 121 is a palindrome 321 is not pallindrome

*/
package org.ApnaCollege.functions;

import java.util.Scanner;

public class _17NumberIsPallindrome {
	
	public static boolean isPalindrome(int n) {
		int rev=0;
		int palindrome = n;
		
		while(palindrome !=0) {
			int rem = palindrome % 10;
			
			rev = rev * 10 + rem;
			palindrome = palindrome/10;
		}
		
		if(n == rev) {
			return true;
		}
		
		return false;
	
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		
		if(isPalindrome(n)) {
			System.out.println("Number: " + n + " ia a palindrome");
		}
		else {
			System.out.println("Number : " + n + " is not a palindrome");
		}

	}

}
