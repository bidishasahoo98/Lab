/*Problem: 4
Create a class MyCalculator which consists of a single method long power(int, int). 
This method takes two integers, n and p, as parameters and finds n^p . If either n or 
p is negative, then the method must throw an exception which says "n or p should 
not be negative.". Also, if both n and p are zero, then the method must throw an 
exception which says "n and p should not be zero."
Input Format:Each line of the input contains two integers, n and p.*/

package operator;

import java.util.Scanner;

class MyCalculator{
 public long power(int n, int p) throws Exception   // Create the method long power(int, int) here.
 {
     if(n == 0 && p == 0)
         throw new Exception("n and p should not be zero.");
     else if(n < 0 || p < 0)
         throw new Exception("n or p should not be negative.");
     else
         return (long)(Math.pow(n,p));
 }}
public class Solution {
	 static MyCalculator Mycalculator = new MyCalculator();
	 static Scanner sc = new Scanner(System.in);
	    
	    public static void main(String[] args) {
	        while (sc.hasNextInt()) {
	            int n = sc.nextInt();
	            int p = sc.nextInt();
	            
	            try {
	                System.out.println(Mycalculator.power(n, p));} 
	            catch (Exception e) {
	                System.out.println(e);
	            }
	        }}}
	