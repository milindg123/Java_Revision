/*
 
 Types of Constructors:
 
 1) Non-parameterized constructor: Parameters are not passed
 
 2) Parameterized Constructor : It having parameters / we can passed the parameters in this type of constructors
 
 3) Copy Constructor : 
 
 
 
 --> Constructor overloading : We can create a multiple objects by using these objects any suitable constructors is called this situation is called as constructor overloading
 							--> this is an example of polymorphism
 
 */



package org.ApnaCollege.OOPs;


class Employee{
	
	String name;
	int empId;
	
	Employee(){
		System.out.println("THis is non_parameterized constructor / default constructor");
	}
	
	Employee(String name){
		this.name = name;
	}
	
	Employee(int empId){
		this.empId = empId;
	}
}


public class _06TypesOfConstructors {
	
	public static void main(String[] args) {
		Employee e1 = new Employee();         // Non-Parameterized constructor
		Employee e2 = new Employee("Milind"); // parameterized constructor --> String name parameter is passed
		Employee e3 = new Employee(123);	  // parameterized constructor --> int empId  parameter is passed

	}

}
