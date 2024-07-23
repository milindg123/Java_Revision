/*
 	Program to demonstrate the single level inheritance
 
 	Single level Inheritance : in this type of inheritance only one base class (single parent class)  and the single derived class(child class)
 */

package org.ApnaCollege.Inheritance;

//Base class (parent class)
class Animal2{
	String solor;
	
	void eat() {
		System.out.println("eats");
	}
	
	void breathe() {
		System.out.println("breathes");
	}
}


//Derived class (child class)
class Fish2 extends Animal2{
	int fins;
	
	void swim() {
		System.out.println("Swims in water");
	}
}


public class _02SingleLevelInheritance {

	public static void main(String[] args) {
		
		Fish2 shark = new Fish2();
		
		shark.eat(); // here fish class doesn't having the eat function but it inherits the properties of the animal class so fish having also the eats function


	}

}
