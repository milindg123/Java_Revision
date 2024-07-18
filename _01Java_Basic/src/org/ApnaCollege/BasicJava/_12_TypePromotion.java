package org.ApnaCollege.BasicJava;

public class _12_TypePromotion {

	public static void main(String[] args) {
		char a = 'a';
		char b = 'b';
		System.out.println((int)(a));
		System.out.println((int)(b));
		System.out.println(a);
		System.out.println(b-a);
/*	
		char c = b-a;  we cannot convert int to char
		
		// Rule No.1 : Java automatically promotes each byte,short or char 
		operand to int when evaluating an expression
*/
		short p = 5;
		byte q = 35;
		char c ='c';
		byte bt =(byte)(p+q+c);
		System.out.println(bt);
/*	
		// Rule no.2 
	 	If one operand is long,float or double whole expression is
		promoted to long, float, double respectively
*/
		int x = 10;   	  //converted to double
		float y = 20.25f; //converted to double
		long z = 25;	  //converted to double
		double d = 30;
		double ans = x + y + z + d;
		System.out.println(ans);
		
		
		
//		Exmaple of type promotion
		
		byte m = 5;
		byte n = (byte)(m*2);
		System.out.println(n);

	}

}
