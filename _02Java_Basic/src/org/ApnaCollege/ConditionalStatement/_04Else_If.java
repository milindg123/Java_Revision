/* Program to demonstrate the else if statements
 *
 *   if(){
 *   
 *   }
 *   
 *   // if the condition is true then it will exit from the condition 
 *   	do not check the further conditions
 *   
 *   else if(){
 *   
 *   }
 
 */

package org.ApnaCollege.ConditionalStatement;

public class _04Else_If {

	public static void main(String[] args) {
		int age = 13;
		
		if(age >= 18) {
			System.out.println("adult");
		}
		
		else if(age >=13 && age < 18) {
			System.out.println("Teenager");
		}
		
		else {
			System.out.println("child");
		}

	}

}
