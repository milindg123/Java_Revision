

package org.ApnaCollege.BasicJava;
import java.util.Scanner;
public class _01JavaBasic {

	public static void main(String[] args) {
//		/ each line end with (;) --> Statement terminator
		
//		For next line we can write println or \n
		
		System.out.println("Hello World!\n");   // each line end with (;) --> Statement terminator
		
		int $ =25;
		System.out.println($);
		
		
		
//	**************	COMMENTS ******************
		
//		Comments are the parts of code that will not execute but can explain the code logic
		
//		There are two types of comments
		
//		1. Single line comments (//)
		
//		2. Multiple line comments (/*      */)
		
		
		
		
//		************Input taken in Java ************************
		
		System.out.println("Input taken in the Java\n\n");
		
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		System.out.println(input);
		
		int number = sc.nextInt();
		System.out.println(number);
		
		float price = sc.nextFloat();
		System.out.println(price);
		
		byte b = sc.nextByte();
		System.out.println(b);
		
		String fname = sc.nextLine();
		System.out.println(fname);
		
		
		System.out.println("End the program");
		
		

	}

}
