/*
 
 	Constructors: Constructors is a special method which is invoked automatically at the time of object creation 
 
 
 	--> Constructor have the same name as class or structure
 	--> Constructor don't have a return type. (Not even void)
 	--> Constructor are only called once, at object creation
 	--> Memory allocation happens when constructor is called
 	
 	
 
 */


package org.ApnaCollege.OOPs;

class Student1{
	String name;
	int rollNo;
	
	//Constructor
//	Student(String name){    ( // here i called Student constructor by default so again i create Student1 constructor)
//		
//		System.out.println("Constructor is called");
//		//this.name = name; // here we can initialized the value of the name
//	}
	
	
	//constructor
	Student1(){
		System.out.println("Constructor is called");
	}
}
public class _05Constructors {

	public static void main(String[] args) {
		Student1 s1 = new Student1();
		
//		Student s1 = new Student("Milind");
//		System.out.println(s1.name);

	}

}
