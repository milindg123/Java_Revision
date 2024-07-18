// Program to demonstrate the calculator by using the switch case

package org.ApnaCollege.ConditionalStatement;

import java.util.Scanner;

public class _10Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a ");
		int a = sc.nextInt();
		System.out.println("Enter the value of b ");
		int b = sc.nextInt();
		
		System.out.println("Enter Operator : ");
		char operator = sc.next().charAt(0);
		
		switch(operator) {
		
		case '+' : System.out.println(a+b);
		break;
		
		case '-' : System.out.println(a-b);
		break;
		
		case '*' : System.out.println(a*b);
		break;
		
		case '/' : System.out.println(a/b);
		break;
		
		case '%' : System.out.println(a%b);
		
		default : System.out.println("Wrong choice enter");
		}

	}

}
