package org.ApnaCollege.BasicJava;

import java.util.Scanner;

public class _09_AreaOfRectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length : ");
		int l = sc.nextInt();
		
		System.out.println("Enter the width : ");
		int w = sc.nextInt();
		
		
		float a = l*w;
		System.out.println("Area of rectangle : " + a);


	}

}
