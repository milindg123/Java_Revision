// Program to demonstrate the Switch statements 
package org.ApnaCollege.ConditionalStatement;

public class _09SwitchStatement {

	public static void main(String[] args) {
		int number = 2;
		switch(number) {
		
		case 1: System.out.println("samosa");
		break;
		
		// if in switch case the first case is match then after that case all the cases will be true
//			To avoid this we must to break the switch cases
		
		case 2: System.out.println("Burger");
		break;
		
		case 3: System.out.println("Milk Shake");
		break;
		
		default: System.out.println("Wrong choice Entered");
		}

	}

}
