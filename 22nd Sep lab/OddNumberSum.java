//write a java program to print the sum of odd numbers up to N


package operator;
import java.util.Scanner;

public class OddNumberSum {
	    public static void main(String args[]) {
	        int sum = 0;
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a number");
	        int n = sc.nextInt();
	       for(int i = 0; i <= n; i++){ 
	            if((i%2) == 1){
	                sum= sum+i;
	            }
	        }
	     
	        System.out.print("Sum of odd numbers between 0 to "+ n + " = " + sum);
	    }
	}

