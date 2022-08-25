//WAP to check anumber is prime or not 

package operator;

import java.util.Scanner;

public class Prime_number {

	public static void main(String[] args) {
		int sum=0;
		Scanner input = new Scanner(System.in);
		//take input from user
		System.out.println("Enter any number:");
		int number=input.nextInt();
		for(int i=1;i<number;i++) {
			if(number%i==0) {
				 sum=sum+i;
				System.out.println("Factors are: "+i);
			}}
		System.out.println("Sum of factors is: "+sum);
		if(sum==number) {
			System.out.println("This is Perfect Number");
		}else {
			System.out.println("This is not Perfect Number");
		}}}
