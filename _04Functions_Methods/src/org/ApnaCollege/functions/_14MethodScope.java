// Program to demonstrate the method Scope

package org.ApnaCollege.functions;

public class _14MethodScope {

	
	public static void printA() {
		int a = 50; // We can access this variable within only this function
	}
	
	
	
	
	public static void main(String[] args) {
		
//		System.out.println(s); // we can't used the variable before its declaration
		int s = 45;
		System.out.println(s);
		
		
		//We can't used the variable which is declared in the another function 
//		System.out.println(a); // here this a variable used and access only in the PrintA() function
	}

}
