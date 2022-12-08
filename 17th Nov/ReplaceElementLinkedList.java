//Write a Java program to replace an element in a linked list.

package Arraylist;
import java.util.LinkedList;

public class ReplaceElementLinkedList {	                //create class
	 public static void main(String[] args) {
	 
	    // Create a LinkedList
	    LinkedList<String> linkedlist = new LinkedList<String>();
	 
	    // Add elements to LinkedList
	    linkedlist.add("Rose");
	    linkedlist.add("Lotus");
	    linkedlist.add("Tulip");
	    linkedlist.add("Sunflower");
	     // Displaying Elements before replace
	    System.out.println("Before Replace:" +linkedlist);
	   
	    // Replacing 4th Element with new value
	    linkedlist.set(3, "Marigold");
        System.out.println("The value of fourth element changed."); //print this statement
        System.out.println("New linked list: " + linkedlist);       //after replacing display elements
	 }
	}

