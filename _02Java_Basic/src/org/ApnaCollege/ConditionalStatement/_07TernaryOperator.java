/* Program to demonstrate the ternary operator

	Ternary Operator : 
	
	Variable = condition ? Statement 1 : Statement 2;
					|			|			|
					------>		True		False
								
								
	Ex. boolean larger = (5>3) ? 5 : 3;


*/
package org.ApnaCollege.ConditionalStatement;

public class _07TernaryOperator {

	public static void main(String[] args) {
		int number = 4;
		
		// Ternary Operator
		String type = (number % 2 == 0) ? "Even" : "Odd";
		System.out.println(type);
	}

}
