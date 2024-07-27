// What will be output of this code? (both classes in same package)

package org.ApnaCollege.OOPAssgnmentQuestion;

class Vehicle{
	void print() {
		System.out.println("Base class (Vehicle)");
	}
}

class Car extends Vehicle{
	void print() {
		System.out.println("Derived class (Car)");
	}
}

public class _04QuestionNo4 {

	public static void main(String[] args) {
		
		
		Vehicle obj1 = new Car();
		obj1.print(); //function Overriding  
// o/p		"Derived class (Car)"
		
		Vehicle obj2 = new Vehicle();
		obj2.print();
// o/p		"Base class (Vehicle)"
	}

}
