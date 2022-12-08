//Write a Java program to insert the specified element at the front of a linked list.

package Arraylist;
import java.util.LinkedList;

public class InsertElement {                               //create class
	  public static void main(String[] args) {
	   // create an empty linked list
	     LinkedList<String> a1 = new LinkedList<String>();
	   // use add() method to add values in the linked list
	          a1.add("Apple");
	          a1.add("Mango");
	          a1.add("Watermelon");
	     System.out.println("Original linked list:" + a1);    //print linkedlist
	  // Add an element to front of LinkedList
	     a1.addFirst("Banana");
	     System.out.println("Final linked list:" + a1);       //after adding print final linkedlist
	 }	
	}

