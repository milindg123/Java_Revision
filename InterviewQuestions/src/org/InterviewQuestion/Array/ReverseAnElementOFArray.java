package org.InterviewQuestion.Array;

public class ReverseAnElementOFArray {
	
	// Function for reverse of an array
	public static void ReverseArray(int arr[]) {
		
		int First = 0, Last = arr.length-1;
		
		while(First < Last){
			
				//swap
				int temp = arr[First];
				arr[First] = arr[Last];
				arr[Last] = temp;
				
				First ++;
				Last --;
			}
	}
		
	// Function for Printing the array
	public static void PrintArr(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};
		
		ReverseArray(arr);  // Reverse Array function call
		
		System.out.println("Reverse Of An Array is : ");
		
		PrintArr(arr); // print the array function call

	}

}
