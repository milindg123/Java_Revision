/* program to demonstrate the function overriding


 Method Overriding / Function Overriding :  Parent and child classes both contain the same function with a different definition
 
 
 */

package org.ApnaCollege.Polymorphism;

class Animal{
	void eat() {
		System.out.println("Eats anything");
	}
}

class Deer extends Animal{
	void eat() {
		System.out.println("Eats grass");
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		Deer d = new Deer();
		d.eat();

	}

}
