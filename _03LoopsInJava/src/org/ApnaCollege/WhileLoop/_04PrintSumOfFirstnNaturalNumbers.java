// Program to demonstrate to print sum of first n natural numbers

package org.ApnaCollege.WhileLoop;

import java.util.Scanner;

public class _04PrintSumOfFirstnNaturalNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range / n : ");
		int n = sc.nextInt();
		int i = 1;
		int sum = 0;
		
		while(i <= n) {
			sum += i;
			i++;
//			System.out.println(sum);
		}
		
		System.out.println("Sum is :" + sum);
	}

}
