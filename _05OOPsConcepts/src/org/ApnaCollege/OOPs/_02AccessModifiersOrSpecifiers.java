/*
 
 Access Modifiers : 4 types of access modifiers / Specifiers are available in java
 ----------------------------------------------------------------------------
 				|Access within class |
 ----------------------------------------------------------------------------------------------							  	
 1) private		|		Y	 		|
 				|					|
 2) default		|					|
 				|					|
 3) protected	|					|
 				|					|
 4) public		|					|
 
 
 
 
 */


package org.ApnaCollege.OOPs;

class BankAccount{
	public String username;
	private String password;  // we can't access this password out of this class because it private 
	
	public void setPassword(String pwd) {
		password = pwd;
	}
}

public class _02AccessModifiersOrSpecifiers {

	public static void main(String[] args) {
		
		BankAccount myAcc = new BankAccount();
		myAcc.username = "Milind";
//		System.out.println(myAcc.username);
		
		myAcc.setPassword("abcdefgh");

	}

}
