// Program to demonstrate the call by value concepts by using the swapping technique

/*		Call by value:
 						java always calls by value
 						Formal parameters (Arguments copy passed to parameters)
 						
 ---> In call by value we *****(do not passed the original value)***** of the variable 
 	  to the formal parameters we passed the ***(copy of the Arguments)**** or copy of original variable 
 						
 
 
 
 */
package org.ApnaCollege.functions;

public class _03CallByValue {
	
	
	// Function for swapping the values 
	public static void swap(int a, int b) {

		//swap 
		int temp = a;
		a = b;
		b = temp;
		System.out.println("a = "+ a);
		System.out.println("b = "+ b);

		
		
	}

	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		swap(a,b);
		
//		
		System.out.println("a = "+ a);
		System.out.println("b = "+ b);

	}

}
