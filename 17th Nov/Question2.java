/*
 1. Develop a java class with a method storeEvenNumbers(int N) using ArrayList to store 
even numbers from 2 to N, where N is a integer which is passed as a parameter to the 
method storeEvenNumbers(). The method should return the ArrayList (A1) created. 
2. In the same class create a method printEvenNumbers()which iterates through the 
arrayList A1 in step 1, and It should multiply each number with 2 and display it in format 
4,8,12….2*N. and add these numbers in a new ArrayList (A2). The new ArrayList (A2)
created needs to be returned.*/

package Arraylist;
import java.util.ArrayList;

public class Question2 {                                        //create class
	ArrayList<Integer> n = new ArrayList<Integer>(); 	// instance ArrayList 1
	ArrayList<Integer> n1 = new ArrayList<Integer>(); 	// instance ArrayList 2
	
	public ArrayList<Integer> storeEvenNumbers(int N) { 	// 1st method to store even numbers upto N
		for(int i = 2;i<N ;i++)
			n.add(i); 				// adding even numbers in n ArrayList by add() method
		return n;
	}
	public ArrayList<Integer> printEvenNumbers() { 		// 2nd method to store the integers in 2nd ArrayList
		for(int i : n) 				// iterating 1st ArrayList
			n1.add(i*2); 				// adding doubled even numbers in num2 ArrayList by add() method
		return n1;
	}
	public int retrieveEvenNumbers(int N) { 		// 3rd method to search specified even number
		int num = 0;
		for(int i : n) {
			if(i==N) 				// checking if specified number is present or not
				num = N;
		}
		return num;
	}
	public static void main(String[] args) { 		// main method to implement other methods
		// TODO Auto-generated method stub
		Question2 ev = new Question2(); 		// object of the class
		System.out.println(ev.storeEvenNumbers(20)); 		// calling 1st method
		System.out.println(ev.printEvenNumbers()); 		// calling 2nd method
		System.out.println(ev.retrieveEvenNumbers(10)); 	// calling 3rd method
		System.out.println(ev.retrieveEvenNumbers(30));
	}
}
