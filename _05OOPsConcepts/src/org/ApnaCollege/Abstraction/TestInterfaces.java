/*
 	Question on Interface : Can we have implements a main() method in the interface ?
 	
 	--> Yes you can write the main() method in the interfaces and it will run properly but
 		
 		we can't override the main method in the interface
 
 */


package org.ApnaCollege.Abstraction;

public interface TestInterfaces {
	
    public static void main(String[] a){    
        System.out.println("I am a static main method inside Inteface !!");
    }

}
