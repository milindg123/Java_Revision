/*
 	Program to demonstrate the continue statement
 	
 	 Continue statement : it the iteration  ex. i==3 the it will skip the 3rd iteration 
 	 and flow of the loop is then continue
 */

package org.ApnaCollege.DoWhileLoop;

public class ContinueStatment {

	public static void main(String[] args) {
		
		// continue statement
		for(int i=1; i<=5; i++) {
			if(i == 3) {
				continue;  //here i== 3 it will skip and remaining is execute
			}
			System.out.println(i);
		}

	}

}
