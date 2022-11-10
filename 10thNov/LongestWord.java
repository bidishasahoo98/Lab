package IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//Longest word of test file
public class LongestWord {

	public static void main(String[] args)throws FileNotFoundException {
		String longest_word = "";//store the longest word
	       String current; //store the current word for comparing
	       Scanner sc = new Scanner(new 
	    		   File("D://test3.txt"));//taking input of file path
              while (sc.hasNext()) { //condition
	          current = sc.next();
	           if (current.length() > longest_word.length()) {
	             longest_word = current;
	           }  }
	         System.out.println(longest_word);
	         
	            }}
