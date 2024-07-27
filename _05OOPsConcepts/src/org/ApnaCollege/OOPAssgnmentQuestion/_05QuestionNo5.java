// Question : What will be the output of the following code
/* 
 	   a) Error
 Ans-->b) 0 2
 	   c) 1 2
 	   d) 2 2
 
 
 */

package org.ApnaCollege.OOPAssgnmentQuestion;

class Book{
	int price;
	static int count;
	
	public Book(int price) {
		this.price = price;
		count++;
	}
}
public class _05QuestionNo5 {

	public static void main(String[] args) {
		System.out.println(Book.count);
		
		Book b1 = new Book(150);
		Book b2 = new Book(250);
		
		System.out.println(Book.count);

	}

}
