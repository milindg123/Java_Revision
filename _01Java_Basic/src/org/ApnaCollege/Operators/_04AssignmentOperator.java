	/*	Assignment Operator
		 * 	=
		 * 	+= ekahi variable mai add karana
		 * 	-=
		 * 	*=
		 * 	/=
		 * 
		 */

package org.ApnaCollege.Operators;

public class _04AssignmentOperator {

	public static void main(String[] args) {

				int A = 10;
//				A = A+10;
				A += 10;  // It will give faster execution
				System.out.println(A);
				
				int B = 5;
//				B = B-5;
				B -= 5;
				System.out.println(B);
				
				int C = 5;
//				C= C*5;
				C *= 5;
				System.out.println(C);
				
				int D = 5;
//				D= D/5;
				D /= 5;
				System.out.println(D);
				
				int p =45;
				p %= p;
				System.out.println(p);
	}

}
