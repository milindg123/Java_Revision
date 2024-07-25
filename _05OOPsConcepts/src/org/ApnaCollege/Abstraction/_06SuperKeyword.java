/*
 	Program to demonstrate the super keyword
 	
 	Super Keyword : Super keyword is used to refer the immediate parent class object
 	
 	Functions of super keyword:
 	1) To access parent's properties
 	2) To access parent's functions
 	3) To access parent's constructor
 
 
 
 */

package org.ApnaCollege.Abstraction;

class Bird{
	Bird(){
		System.out.println("Bird construcotr is called");
	}
}

class Sparrow extends Bird{
	Sparrow(){
		super();
		System.out.println("Sparrow constructor is called");
	}
}
public class _06SuperKeyword {

	public static void main(String[] args) {
		Sparrow s = new Sparrow();

	}

}
