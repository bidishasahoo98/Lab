//Write a Java program to extract a portion of an array list.

package Arraylist;
import java.util.*;

public class ExtractArrayList {
	  public static void main(String[] args) {
	  // Create a list and add some colors to the list
	  ArrayList<String> a1 = new ArrayList<String>();
	  a1.add("Red");
	  a1.add("Green");
	  a1.add("Orange");
	  a1.add("White");
	  a1.add("Black");
	  System.out.println("Original list: " + a1);
	  List<String> sub_List = a1.subList(0, 3);
	  System.out.println("List of first three elements: " + sub_List);
	 }
	}

