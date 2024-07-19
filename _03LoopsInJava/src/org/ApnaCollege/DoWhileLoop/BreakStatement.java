/*
 	Break Statement : to exit the loop break statement is used
 	
 */


package org.ApnaCollege.DoWhileLoop;

public class BreakStatement {

	public static void main(String[] args) {
		
		for(int i =1; i<=5; i++) {
			if(i == 3) {
				break;
				// Here if i==3 then the next iteration of the loop is exit
			}
			System.out.println(i);
		}
		
		System.out.println("I am out of the loop");

	}

}
