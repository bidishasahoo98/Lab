//You are given a class AdvancedArithmetic which contains a method signature int
//divisor_sum(int n). You need to write another class called MyCalculator which implements the method

package operator;

import java.util.Scanner;

class AdvancedArithmetic{
	int num;
	void divisorSum() {
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		int sum=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				sum=sum+i;
		}}
System.out.println("sum of all divisor:"+sum);
}}

public class MyCalculator {

	public static void main(String[] args) {
		
		AdvancedArithmetic ad=new AdvancedArithmetic();
		ad.divisorSum();
	}}
