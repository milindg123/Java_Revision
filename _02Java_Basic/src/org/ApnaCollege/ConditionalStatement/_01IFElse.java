/* This Program is demonstrate the If Else statement
	
	if(condition){
	
		//do something
	}
	
	else{
	
		// otherwise do this
	}
*/
package org.ApnaCollege.ConditionalStatement;

public class _01IFElse {

	public static void main(String[] args) {
		
		int age = 16;
		if(age >= 18){
			System.out.println("adult : drive, vote");
		}
		
		if(age>13 && age< 18) {
			System.out.println("teenager");
		}
		else {
			System.out.println("not adult");
		}

	}

}
