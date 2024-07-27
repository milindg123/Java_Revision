/*
 	Question : Which of the following is a correct statement? (both classes in same package)
 	
 	class Vehicle()
	class Car extends Vehicle()
	
	a) Car c = new Car();
	b) Vehicle v = new Vehicle();
	
	//Child ka object parent ke reference variable can assign 
	c) Vehicle v = new Car();
	
	d) Car c = new Vehicle(); //Not possible
*/




package org.ApnaCollege.OOPAssgnmentQuestion;

class Vehicle1{
	
}

class Car1 extends Vehicle{
	
}

public class _03QuestionNo3 {

	public static void main(String[] args) {
		
		Car1 c = new Car1();
		
		Vehicle1 v = new Vehicle1();
		
//		Vehicle1 v1 = new Car1(); // car ka object parent class Car ko assign kar sakate hai
		
//		Car c1 = new Vehicle(); // Not Possible //Runtime Error

	}

}
