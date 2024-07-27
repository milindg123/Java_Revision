/*
 	Question : Which variable(s) can the class Person access in the following code ?
 	
 Ans --> a) name
 Ans --> b) weight
 	 	 c) rollNumber
 	 	 d) schoolName
 
 
 
 */

package org.ApnaCollege.OOPAssgnmentQuestion;

class Person{
	String name;
	int weight;
}

class Student3 extends Person{
	int rollNumber;
	String schoolName;
}
public class _02QuestionNo2 {

	public static void main(String[] args) {
		
		Person p = new Person();
		
//		p.rollNumber = 20;  // Can not access

	}

}
