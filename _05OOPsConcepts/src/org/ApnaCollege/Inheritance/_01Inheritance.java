/*
 	Inheritance : Inheritance is when properties and methods of base class(parent class) 
 				  are passed on to a derived class (Child Class)
 
 
 
 */


package org.ApnaCollege.Inheritance;

//Base class (parent class)
class Animal{
	String solor;
	
	void eat() {
		System.out.println("eats");
	}
	
	void breathe() {
		System.out.println("breathes");
	}
}


//Derived class (child class)
class Fish extends Animal{
	int fins;
	
	void swim() {
		System.out.println("Swims in water");
	}
}

public class _01Inheritance {

	public static void main(String[] args) {
		Fish shark = new Fish();
		
		shark.eat(); // here fish class doesn't having the eat function but it inherits the properties of the animal class so fish having also the eats function

	}

}
