/*Problem 1. 
Write a Java method to check whether every digit of a given integer 
is even. Return true if every digit is odd otherwise false? */

package Assignment;

import java.util.Scanner;

public class EvenTrue {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        System.out.println("Input an integer:");
	        int n = in.nextInt();
	        System.out.println("Check whether every digit of the integer is even or not!");
	        System.out.println(test(n));
	        }

	  public static boolean test(int n){
	    if (n == 0){
	        return false;
	    }
	    while(n != 0){
	        if((n % 10) % 2 != 0){
	            return false;
	        }
	        n /= 10;
	    }
	     return true;
	}

}
