// Program to demonstrate to check if a student is pass or fail

package org.ApnaCollege.ConditionalStatement;

import java.util.Scanner;

public class _08CheckIfStudentIsPassOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks obtained:");
		int marks = sc.nextInt();
		
		// Ternary Operator
		String Status = (marks>=33) ? "Pass": "Fail";
		System.out.println(Status);

	}

}
