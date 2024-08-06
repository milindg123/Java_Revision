
// Program to demonstrate the pattern of the inverted half pyramid rotated by 180 degree

package ord.pattern.practice;

import java.util.Scanner;

public class InvertedHalfPyramidRotatedby180deg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n : ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
