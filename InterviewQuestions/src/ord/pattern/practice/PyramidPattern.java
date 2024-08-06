package ord.pattern.practice;

import java.util.Scanner;

public class PyramidPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			
			for(int j=1; j<=n; j++) {
				System.err.println();
			}
			for(int j=1; j<=i; j++) {
				System.err.print(" *");
			}
			System.out.println();
		}

	}

}
