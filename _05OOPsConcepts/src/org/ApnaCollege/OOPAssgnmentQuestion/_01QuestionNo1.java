/*
  	Find out the correct statement to assign name to object
 	1) s->name = "Milind"
 	2) Student.name = "Milind"   // This is also used but the name variable should be static then we can also access Class Name 
 	
 -->3) s.name = "Milind" // This is correct answer
 
 
 
 
 */

package org.ApnaCollege.OOPAssgnmentQuestion;

class Student{
	String name;
	int marks;
}
public class _01QuestionNo1 {

	public static void main(String[] args) {
		Student s = new Student();
		
		s.name = "Milind";
	}

}
