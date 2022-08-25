//WAP to find factorial of any number

package operator;

import java.util.Scanner;

public class Factorial_number {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//take input from user
		System.out.println("Enter any number:");
		int number=input.nextInt();
		int fact =1;
		if(number<0) {
			System.out.println("Invalid number");
		}else {
			for(int i=1;i<=number;i++) {
				 fact=(fact*i);
			}
			System.out.println("factorial of this number is :" +fact);
		}}}
