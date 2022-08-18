//Write a Java program that accepts two integers from the user and then prints the sum, the difference, the product, the average, the distance (the difference between integer), the maximum (the larger of the two integers), the minimum (smaller of the two integers).


package operator;

import java.util.Scanner;

public class Sumdiffproavgmaxmin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //creating scanner class
		System.out.println("Enter 1st number:");
		int a=sc.nextInt(); 
		System.out.println("Enter 2nd number:");
		int b=sc.nextInt();
        int sum= a+b;
        int product= a*b;
        int d=a-b;
        float avg= (a+b)/2;
        int distance= a-b;
        int max ;
        int min;
        System.out.println("Sum is : " +sum);
        System.out.println("Difference between two number is : " +d);
        System.out.println("Product is : " +product);
        System.out.println("Average is : " +avg);
        System.out.println("Distance  between two number is : " +distance);
        System.out.println("Max number between "+ a + " and " + b + " is " + Math.max(a,b));
        System.out.println("Min number between "+ a + " and " + b + " is " + Math.min(a,b));
	}

}
