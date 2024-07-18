package org.ApnaCollege.BasicJava;

public class _11_TypeCasting {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		float a = 25.12f;
		
//		Typecasting :-also called narrowing, explicit conversioning
		
		int b =(int) a; 
		
		System.out.println(b);
		
		float marks = 99.999f;
		int marks2 = (int) marks;
		System.out.println(marks2);
		
		
		char ch = 'a';
		char ch2 = 'b';
		int number = ch;
		int number2 = ch2;
		System.out.println(number);
		System.out.println(number2);
		
		char ch3 = 'A';
		int number3 = ch3;
		System.out.println(number3);
	}

}
