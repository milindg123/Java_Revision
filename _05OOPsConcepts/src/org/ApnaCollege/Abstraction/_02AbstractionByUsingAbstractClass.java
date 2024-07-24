/*
	Program to demonstrate the Abstraction by using the abstract method

	
	Abstract class : the class having the abstract keyword is called as the abstract class
	
	--> Can not create an instance of abstract class (i.e we can not create any object of that class)
	
	--> Can have abstract/ Non-abstract methods
	
		1)--> abstract method --> it does not contain any method body
	
			for ex. abstract void play();
			
		2)--> Non-abstract method --> it contain the method body
			for ex. void play(){
					
						//method body
					}
					
	--> Can have Constructors
		

 */

package org.ApnaCollege.Abstraction;

abstract class Animal{
	String color;
	
	//Constructor
	Animal(){
		color ="brown";
	}
	
	
	// Non-Abstract method
	void eat() {
		System.out.println("animal eats");
	}
	
	// abstract method
	abstract void walk();     //animal par depend nahi karega ki konsa animal kaisa walk karega it depend on the animal type or subclasses
}

// ----------------------------------------------------------------------------------------------------
class Horse extends Animal{
	
	Horse(){
		System.out.println("Horse constructor called");
	}
	
	void changeColor() {
		color = "dark brown";
	}
	void walk() {
		System.out.println("walks on 4 legs");
	}
}

// ------------------------------------------------------------------------------------------------

class Mustang extends Horse{
	Mustang(){
		System.out.println("Constructor called");
	}
}


//------------------------------------------------------------------------------------------------------------
class Chicken extends Animal {
	void changeColor() {
		color = "Yello";
	}
	
	void walk() {
		System.out.println("walks on 2 legs");
	}
}


//-----------------------------------------------------------------------------------------------

public class _02AbstractionByUsingAbstractClass {

	public static void main(String[] args) {
		Horse h = new Horse();
		h.eat();
		h.walk();
		System.out.println(h.color); //constructor call --> parent constructor call then children constructor call
		
//		Constructor calling hierarchy
//		Animal -> Horse -> Mustang
		Mustang myHorse = new Mustang();
		
		Chicken c = new Chicken();
		c.eat();
		c.walk();
		
//		Animal a = new Animmal();  // We can not create an object of the animal class because its abstract class

	}

}
