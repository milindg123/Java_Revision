/* Program to demonstrate the hierarchial inheritance
 
 	Hierarchial Inheritance : single base class having multiple base class
 	
 			base class
 	    		/\
 	   		   /  \
    derived class  Derived class
    
    
    
    from the below program the child classes mammal,fish and bird are inherits the properties of the base class (parent class) Animal
 */

package org.ApnaCollege.Inheritance;

// Base class
class Animal4{
	String color;
	
	void eat() {
		System.out.println("eats");
	}
	void breathe() {
		System.out.println("breathes");
	}
	
}


//Derived class
class Mammal2 extends Animal4{
	void walk() {
		System.out.println("walks");
	}
}

//derived class
class Fish3 extends Animal4{
	void swim() {
		System.out.println("swim");
	}
}

//derived class
class Bird extends Animal4{
	void fly() {
		System.out.println("fly");
	}
}

public class _04HierarchialInheritance {

	public static void main(String[] args) {
		 Bird sparrow = new Bird();
		 sparrow.eat();

	}

}
