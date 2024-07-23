/*  Program to demonstrate the multilevel inheritance
 
 	Multilevel inheritance : parent class -> derived class --> derived class
 	
 	Base class --> Derived class --> Derived Class
 	
 	Real time example : Grandfather --> Father --> Son
 
 */


package org.ApnaCollege.Inheritance;

//Base class (parent class)
class Animal3{
	String color;
	
	void eat() {
		System.out.println("eats");
	}
	
	void breathe() {
		System.out.println("breathes");
	}
}

class Mammal extends Animal3{
	int legs;
}

class Dog extends Mammal{
	String breed;
}

public class _03MultiLevelInheritance {

	public static void main(String[] args) {
		
		Dog tobby = new Dog();
		
		tobby.eat();
		tobby.legs = 4;
		System.out.println(tobby.legs);
		
	}

}
