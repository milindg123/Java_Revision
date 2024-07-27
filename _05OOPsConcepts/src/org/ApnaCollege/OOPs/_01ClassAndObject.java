/* Program to demonstrate the basic concepts of the objects and the classes
 	
 	Objects : Objects is a any real world entities
 			
 			for ex. Pen class having p objects
 			
 			Syntax: Pen p = new Pen(); 			
 	
---------------------------------------------------------------------------------------------- 	
 	
 	Class : Class is a blueprint of Objects
 			Class is group on objects
 			
 			class Person{
 			
 				// Data members
 				// Methods/Functions
 			}
------------------------------------------------------------------------------------------ 			
 			
 	Note : Private and Protected access modifier are not allowed in front of the class
 			i.e. private class A{} and protected class A{}  // Not allowed
 			
 		   public and default access modifiers can be allowed in front of class
 		   
 ---------------------------------------------------------------------------------------------------
 	
 --> Nested class :  can public, private, default , protected 
 --> Constructor  :  can public, private, default , protected 
 --> Methods	  :  can public, private, default , protected 
 --> Field		  :  can public, private, default , protected 
 
 */


package org.ApnaCollege.OOPs;

class Pen{
	String color;
	int tip;
	
	void setColor(String newColor) {
		color = newColor;
	}
	
	void setTip(int newTip) {
		tip = newTip;
	}
}

class Student{
	String name;
	int age;
	float percentage;
	
	void CalcPercentage(int phy, int chem, int math) {
		percentage  = (phy+chem+math)/3; 
	}
}



public class _01ClassAndObject {
	
	public static void main(String[] args) {
		Pen p1 = new Pen(); //created a pen object called p1
		p1.setColor("Blue");
		System.out.println(p1.color);
		
		p1.setTip(5);
		System.out.println(p1.tip);
		
		p1.color = "Yello";
		System.out.println(p1.color);
		
		
	}

}
