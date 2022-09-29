/*Program to create library book Management system
to store and display book details in library where you can 
create two classes one is main another one is library, where you can 
create two methods as addBook,dispanseBook and 
bookId,bookName,bookAuthor as instance variables*/


package Assignment;

import java.util.Objects;
import java.util.Scanner;

class library { // Class
            // Class data members
		public String bookId;
		String bookName;
		String bookAuthor; 
		public void addBook(String bookId, String bookName, String bookAuthor) { // for adding book
			this.bookId = bookId; 
			this.bookName = bookName; 
			this.bookAuthor = bookAuthor; }
		public void dispenseBook(String bookId, String bookName, String bookAuthor) { // for dispense book 
// checking is book details is matched or not
if (Objects.equals(this.bookId, bookId) && Objects.equals(this.bookName,bookName) && Objects.equals(this.bookAuthor,bookAuthor))
		{
	System.out.println("[ "+bookId+" ,"+bookName+" ,"+bookAuthor+" ] is Assigned to you :) "); 
	} else {
		System.out.println("Sorry we don't found any book matches with your provided details"); }
	}}

	 public class LibraryBookManagement {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			library  ob=new library ();
			ob.addBook("20210","WINGS OF FIRE","APJ ABDUL KALAM");
			ob.dispenseBook("00001", "theory of relativity", "albert einstein");
			}}
