/*
  	Loop --> Repeat 
  	
  	 Loop 3 types
  	 
  	 1) While Loop		|	2) for loop 							|	3) do while
 				|									|
 	Syntax :		|	Syntax :							| 	Syntax :
 				|									|	
 	while(condition){	|	for(int i = 0;   i<=n;       i++ );				|	do{
 				|	//Initialization //condition //updation				|
 	 //do something		|									|		// Do something
 				|									|	}
 	}												|	while(Condition);
 
 */


package org.ApnaCollege.WhileLoop;

public class _01WhileLoop {

	public static void main(String[] args) {
		
		int counter = 0;
		while(counter < 10) {
			System.out.println("Hello World");
			counter++;
		}
		
		System.out.println("Printed HW 10x");

	}

}
