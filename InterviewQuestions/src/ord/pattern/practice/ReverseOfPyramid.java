package ord.pattern.practice;

import java.util.Scanner;

public class ReverseOfPyramid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n : ");
		int n = sc.nextInt();
		
		// Logic for pyramid 
		
//		for(int i=1; i<=n; i++) {
//			
//			for(int j=1; j<=n-i; j++) {
//				System.out.print(" ");
//			}
//			
//			for(int j=1; j<=i; j++) {
//				System.out.print("* ");
//			}
//			
//			System.out.println();
//			
//		}
		
		
		// Logic for reverse a Pyramid
		for(int i=n; i>=1; i--) { // simple changes made in this line only otherwise same logic apply
			
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			
			System.out.println();
			
		}
		


	}

}
