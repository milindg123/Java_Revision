/*
 	Program to demonstrate the interfaces
 	
 --> Interfaces : Interfaces is blueprint of the classes
 	
 	
 --> **** Work of interfaces: *****
 	
 	1) multiple inheritance implementation
 	2) To achieve total abstraction
 	
 	
 -->****** Properties of Interfaces **********	
 
 	1) Interfaces can be defined as interface keyword
 	2) For inherit the interface we use (implements) keyword
 	3) All methods are public, abstract and without implementation
 	4) Used to achieve total abstraction
 	5) Variables in the interfaces are final, public and static
 	
 
 */


package org.ApnaCollege.Abstraction;

// Creating a interface
interface ChessPlayer{
	void moves(); // abstract method 
}

class Queen implements ChessPlayer{
	
	public void moves() {
		System.out.println("up, down, left, right, diagonal (in all 4 direction)");
	}
}

class Rook implements ChessPlayer{
	public void moves() {
		System.out.println("up, down, left, right");
	}
}

class King implements ChessPlayer{
	public void moves() {
		System.out.println("up, down, left, right, diagonal (by 1 step)");
	}
}



public class _03Interfaces {

	public static void main(String[] args) {
		Queen q = new Queen();
		q.moves();

	}

}
