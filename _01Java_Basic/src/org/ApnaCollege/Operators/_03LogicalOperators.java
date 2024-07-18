		/*  Program to demonstrate the logical operators 
		 * 
		 * 
		 * Logical Operators
		 * 	
		 * 1.	&& (Logical AND)   AND Gate-> both Statements True then True otherwise False
		 * 2.	|| (Logical OR)    OR Gate -> Both Statements False then False otherwise TRUE
		 * 3.	!  (Logical Not)   1.true--> False   2. False-->True
		 * 
		 * 
		 */

package org.ApnaCollege.Operators;

public class _03LogicalOperators {

	public static void main(String[] args) {
	
				System.out.println("******* Example of && Logical AND Operator ******");
				System.out.println((3>2) && (5>0));
				System.out.println((3>2) && (5<0));
				
				
				System.out.println("\n******* Example of || Logical OR Operator ************");
				System.out.println((3>2) || (5>0));
				System.out.println((3<2) || (5<0));
				 
				System.out.println("\n******* Example of ! Logical NOT Operator ************");
				System.out.println(!(3>2));
				System.out.println(!(5<0));
				
				
				
		/*
		 * 	output:
				******* Example of && Logical AND Operator ******
				true
				false
				
				******* Example of || Logical OR Operator ************
				true
				false
				
				******* Example of ! Logical NOT Operator ************
				false
				true

		 * 
		 */
	}

}
