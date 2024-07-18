package org.ApnaCollege.BasicJava;

import java.util.Scanner;

public class _07_UserInputInJava {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your input : ");
		String input = sc.next();
		System.out.println("You enter your input is : " + input);
		
		
		/*
		  	sc.next() - It only take one word
		  	
		  	sc.nextLine() - It takes whole line as input
		  	
		  	sc.nextInt()  - It takes integer as input
		  	
		  	sc.nextFloat()-
		  	
		  	sc.nextBoolean() -
		  	
		  	sc.nextDouble()  -
		  	
		  	sc.nextShort()  -
		  	
		  	sc.nextLong()  -
		 */
		
		
		Short num1 = sc.nextShort();
		System.out.println(num1);
		
		Long adharNo = sc.nextLong();
		System.out.println(adharNo);


	}

}
