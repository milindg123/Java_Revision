/*

	Copy Constructor : We can passed the already created constructor copy to the copy constructor
	
	Types of Copy constructor 

	1) Shallow Copy Constructor : Only references are passed to this type of copy constructor
								  changes reflect

	2) Deep Copy COnstructor    : the new array/ is created not reference is passed
								  Changes don't reflect


 */




package org.ApnaCollege.OOPs;

class Manager{
	String name;
	int rollNo;
	String password;
	int marks[];
	
	
	//Copy constructor
//	Manager(Manager m1){
//		marks = new int[2];
//		this.name = m1.name;
//		this.rollNo = m1.rollNo;
//		this.marks = m1.marks;
//		
//	}
	
	
	//shallow Copy constructor
	
//	Manager(Manager m1){
//		marks = new int[2];
//		this.name = m1.name;
//		this.rollNo = m1.rollNo;
	
//		this.marks = m1.marks;  //here only the reference of the array is given
//		
//	}
	
	
	// Deep copy constructor
	Manager(Manager m1){
		marks = new int[2];
		this.name = m1.name;
		this.rollNo = m1.rollNo;
		
		//here direct a new array can be created for storing the marks
		for(int i=0; i<marks.length; i++) {
			this.marks[i] = m1.marks[i];
		}
	}
	
	Manager(){
		marks = new int[2];
		System.out.println("Constructor is called");
	}
}


public class _07CopyConstructor {

	public static void main(String[] args) {
		Manager m1 = new Manager();
		m1.name = "Milind";
		m1.rollNo = 123;
		m1.password = "abcd";
		m1.marks[0] = 100;
		m1.marks[1] = 90;  // before change
	
		Manager m2 = new Manager(m1);
		m2.password = "xyz";
		m1.marks[1] = 20; // after the changing of the value
		for(int i=0; i<2; i++ ) {
			System.out.println(m2.marks[i]);
		}
		
		
		
	}

}
