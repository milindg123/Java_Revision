		// Program to demonstrate the different types of operators 


		/* Operators : Operators are the symbols that tell compiler to perform some operation

			Types of operators 
			1) Arithmetic operators : (+, -, *, /, %)
			2) Logical Operators 	: (&&, //, !)
			3) Relational Operators : (<, >, =<, >=, ==)
			4) Assignment Operators : (=, +=, =-, *=, /=, %=)
			5) Increment Operators  : ()
			6) Decrement Operators  : ()
			7) Bitwise Operators 	: (&, |, ^, >>(right shift),  <<(left shift)) 

		*/
package org.ApnaCollege.Operators;

public class _01Operators {

	public static void main(String[] args) {


				
				System.out.println("************* Arithmetic Operators: *********** ");
				System.out.println("\n");
				System.out.println("1. Binary Arithmetic Operators:");
				int A = 10;
				int B = 5;
				System.out.println("Add = " + (A+B));
				System.out.println("Substract = " + (A-B));
				System.out.println("Multiplication = " + (A*B));
				System.out.println("Division = " + (A/B));
				System.out.println("Modulo = " + (A%B));
				
				
				
				System.out.println("\n\n******************************");
				System.out.println("2. Unary Arithmetic Operators: ");
				
				
				/* a = a+1      ++   increment operator   
				 * a = a-1      --   decrement operators
				 * 
				 * Pre Increment ----> ++a  --> before --> 1. value change 2. value use
				 * Post Increment ---> a++  --> After  --> 1. value use    2. value change 
				 */
//				*********** Example of Pre Increment ***********************
				System.out.println("\n************ Example of Pre Increment ******************");
				int a = 10;
				int b = ++a;
				System.out.println("Value of a is : "+ a);
				System.out.println("Value of b is : "+ b);
				
				
//				*********** Example of Post Increment **********************
				System.out.println("\n\n************ Example of Post Increment******************");
				int p = 10;
				int q = p++;
				System.out.println("Value of p is : " + p);
				System.out.println("Value of q is : " + q);
				
				
				System.out.println("\n\n ********** Decrement Operaters: *******");
				System.out.println("\n************ Example of Pre Decrement******************");
				int x = 10;
				int y = --x;
				System.out.println(x);
				System.out.println(y);
	}

}
