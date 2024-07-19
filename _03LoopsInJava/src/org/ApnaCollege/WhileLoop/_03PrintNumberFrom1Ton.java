// Program to demonstrate the print the number from 1 to n

package org.ApnaCollege.WhileLoop;
import java.util.Scanner;
public class _03PrintNumberFrom1Ton {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		
		int counter = 1;
		
		while(counter <= n) {
			System.out.println(counter);
			counter++;
		}

	}

}
