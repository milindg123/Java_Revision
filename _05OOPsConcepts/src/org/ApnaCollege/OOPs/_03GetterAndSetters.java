// Program to demonstrate the getters and setters

package org.ApnaCollege.OOPs;

class Pencil{
	private String color;
	private int tip;
	
	
	//Getter : to return the value
	String getColor() {
		return this.color;  // this --> this keyword is used to refer the current objects we can not pass the objects directly by using this keyword we can access the objects properties
	}
	
	int getTip() {
		return this.tip;
	}
	
	// Setter: to modify the value
	void setColor(String newColor) {
		this.color = newColor;
	}
	
	void setTip(int tip) {
		this.tip = tip;
	}
}
public class _03GetterAndSetters {

	public static void main(String[] args) {
		
		Pencil p1 = new Pencil(); // creating objects of the pencil class
		
		p1.setColor("Blue"); // here we can modify the color of the pencil
		System.out.println(p1.getColor()); // here we can return the modify value of the color i.e. Blue
		
		p1.setTip(5);;
		System.out.println(p1.getTip());
		
		p1.setColor("Yellow");
		System.out.println(p1.getColor());
	}

}
