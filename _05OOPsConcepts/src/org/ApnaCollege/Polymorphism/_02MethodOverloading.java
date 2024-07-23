/*
  Program to demonstrate the method overloading
  
  // Compile time poly
  Method Overloading : Multiple functions with the same name but different parameters
 
 */

package org.ApnaCollege.Polymorphism;

class Calculator{
	int sum (int a, int b) {
		return a+b;
	}
	
	float sum(float a, float b) {
		return a+b;
	}
	
	int sum(int a, int b, int c) {
		return a+b+c;
	}
}

public class _02MethodOverloading {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		System.out.println(calc.sum(1, 2));
		System.out.println(calc.sum(1.5f, 2.5f));
		System.out.println(calc.sum(1, 2,5));
		

	}

}
