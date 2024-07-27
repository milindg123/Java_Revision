/*
 	Program to implements static keyword
 	
 	Static --> (constant, as it is things we can write by using the static keyword)
 	
 	Static Keyword : static keyword in java is used to share the same variable or method of a given class
 	
 	--> Properties  --|
 			  |--> Function and properties we can make the static by using the static keyword 
 	--> Functions 	--|	for ex. School Name of each and every student is same then we simply make the school name is static

  	// Not important for interview perspective
 	--> Blocks
 	--> Nested Classes
 	
 
 
 
 
 
 
 */

package org.ApnaCollege.Abstraction;

class Student{
	String name;
	int rollNo;
	
	// static keyword : school name of the student should be same
	static String schoolName;
	
	void setName(String name) {
		this.name = name;
	}
	
	String getName() {
		return this.name;
	}
}
public class _05StaticKeyword {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.schoolName = "Shramik";
		
		Student s2 = new Student();
		System.out.println(s2.schoolName); // It takes s1 school name 
		
		
		Student s3 = new Student();
//		s3.schoolName = "abc";
		System.out.println(s3.schoolName);

	}

}
