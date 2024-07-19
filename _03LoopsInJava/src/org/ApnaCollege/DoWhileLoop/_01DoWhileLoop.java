/*
  	Loop --> Repeat 
  	
  	 Loop 3 types
  	 
  	 1) While Loop		|	2) for loop 							|	3) do while
 						|											|
 	Syntax :			|	Syntax :								| 	Syntax :
 						|											|	
 	while(condition){	|	for(int i = 0;   i<=n;       i++ );		|	do{
 						|	//Initialization //condition //updation	|
 	 //do something		|											|		// Do something
 						|											|	}
 	}					|											|
 						|											|	while(Condition);
 
 
 		******* Do While Loop --> Execute at least once if condition is true or not 
 
 */					 														

package org.ApnaCollege.DoWhileLoop;

public class _01DoWhileLoop {

	public static void main(String[] args) {
		int counter = 1;
		do {
			System.out.println("Hello WOrld");
			counter++;
		}
		
		while(counter <= 10);

	}

}
