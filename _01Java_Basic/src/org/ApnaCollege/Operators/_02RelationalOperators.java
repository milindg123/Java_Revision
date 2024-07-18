		/* Relational Operators 
		 * 	==		It checks the two values are equal or not	
		 * 	!=	Not Equal to
		 * 	>	is Greater than
		 * 	<	is Lesser than
		 * 	>=  Greater than or equal to
		 * 	<= less than or equal to
		 * 
		 */

package org.ApnaCollege.Operators;

public class _02RelationalOperators {

	public static void main(String[] args) {


				System.out.println("********** Example of isEqual(==)operator *******");
				int A = 10;
				int B = 10;
				System.out.println((A==B));
				
				int c = 10;
				int d = 5;
				System.out.println(c==d);
				
				System.out.println("\n*********** Example of isNotEqualto (!=) operator ****** ");
				
				int a = 10;
				int b = 5;
				System.out.println((a!=b));  //Return True
				
				int C = 10;
				int D = 10;
				System.out.println(C!=D);  	//Return False
				
				System.out.println("\n*********** Example of greater than (>) operator ****** ");
				
				int P = 10;
				int Q = 5;
				System.out.println((P>Q));
				
				int p = 10;
				int q = 5;
				System.out.println((q>p));
				
				
				System.out.println("\n*********** Example of less than (<) operator ****** ");
				
				int r = 10;
				int s = 5;
				System.out.println((r<s)); //false
				
				int R = 10;
				int S = 5;
				System.out.println((S<R)); // true
				
				
				System.out.println("\n*********** Example of greater than equal to (>=) operator ****** ");
				
				int X = 10;
				int Y = 5;
				System.out.println((X>=Y)); //true
				
				int x = 10;
				int y = 5;
				System.out.println((y>=x)); // false
				
				System.out.println("\n*********** Example of less than equal to (<=) operator ****** ");
				
				int g = 10;
				int h = 5;
				System.out.println((g<=h)); // o/p -> false
				
				int G = 10;
				int H = 5;
				System.out.println((H<=G)); // o/p -> true
	}

}
