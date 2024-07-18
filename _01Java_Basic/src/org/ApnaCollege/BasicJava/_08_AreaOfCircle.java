package org.ApnaCollege.BasicJava;

import java.util.Scanner;

public class _08_AreaOfCircle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of circle: ");
		float rad = sc.nextInt();
		
		System.out.println("Area of Circle is : ");
		float Area= (3.14f * rad * rad);
		System.out.println(Area);
		

	}

}
