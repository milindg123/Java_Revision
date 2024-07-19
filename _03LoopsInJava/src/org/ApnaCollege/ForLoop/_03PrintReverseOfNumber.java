// Program to Print Reverse of a number

package org.ApnaCollege.ForLoop;

public class _03PrintReverseOfNumber {

	public static void main(String[] args) {
		
		int n = 10899;
		
		while( n > 0){
			
			int lastDigit = n % 10; // for finding last digit
			n = n/10;				// for removing the last digit of the number
			
			System.out.print(lastDigit);
		}

	}

}
