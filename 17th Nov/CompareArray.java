//Write a Java program to compare two array lists.

package Arraylist;

import java.util.ArrayList;

public class CompareArray {                              //create class
	public static void main(String[] args) {
   ArrayList<String>al = new ArrayList<String>(); 	// taking one string type arraylist named al1
	//adding elements in the arraylist
	al.add(0,"Red");
	al.add(1,"Green");
	al.add(2,"Black");
	al.add(3,"White");
	al.add(4,"Pink");
	
  ArrayList<String>a2 = new ArrayList<String>(); 	// taking another string type arraylist named al2
	//adding elements in the arraylist
	a2.add(0,"Red");
	a2.add(1,"Green");
	a2.add(2,"Black");
	a2.add(3,"Pink");
	 // Display both ArrayList
    System.out.println(" ArrayList1 = " +al);
    System.out.println(" ArrayList2 = " +a2);
    

    for(String i : al) {
		if(a2.contains(i)) 				// checking if the element is present or not
			System.out.print("Yes  ");
		else
			System.out.print("No  ");
	}
}
}
