/*
 
 // Program to demonstrate the number is prime or not
  
 
  isPrime :  for(int i=2 to n-1)  not optimized way
  
   -----------------------------------------------------------------------------------------

  isPrime :  for(int i=2 to Math.sqrt(n) --> Optimized way
  
  number    Factors
  	6 ----> 1*6
  			2*3
  		 --------- from here below the factors get repeating i.e 
  			3*2		
  			6*1			n = sqrt(n)*sqrt(n) 
 
 
 */





package org.ApnaCollege.functions;

import java.util.Scanner;

public class _09NumberIsPrimeOrNot {

//	public static boolean isPrime(int n) {
//	
//		if(n == 2) {
//			return true;
//		}
//		for(int i=2; i<=Math.sqrt(n); i++) {
//			if(n % i == 0) { //Completely Dividing
//				return false;
//			}
//		}
//		return true;
//	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n : ");
		int n = sc.nextInt();
		
//		boolean Prime = isPrime(n);
//		System.out.println(Prime);
		
	 	
		 	if(n== 2) {
		 		System.out.println("number is prime");
		 	}
		 	else {
			 	boolean isPrime = true;

			 	for(int i=2; i<=n-1; i++) {
			 		if(n % i == 0) {
			 			isPrime = false;
			 		}
			 	}
			 	
			 	if(isPrime == true) {
			 		System.out.println("number is prime");
			 	}
			 	
			 	else {
			 		System.out.println("Number is not prime");
			 	}
		 	}
			 	

	}

}
