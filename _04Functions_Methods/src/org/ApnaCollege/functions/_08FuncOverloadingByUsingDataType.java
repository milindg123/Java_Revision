/* Program to demonstrate the function overloading using data types 
 
 	In this program first function is used for sum of int numbers
 		   and the second function is used for sum of float numbers 

*/

package org.ApnaCollege.functions;

public class _08FuncOverloadingByUsingDataType {

	// func to calc to int sum
	public static int sum(int a, int b) {
		return a+b;
	}
	
	// func to calc to float sum
	public static float sum(float a, float b) {
		return a+b;
	}
	public static void main(String[] args) {
		System.out.println(sum(10, 5));
		
		System.out.println(sum(10.5f, 2.5f));

	}

}
