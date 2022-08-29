//   *
//  * *
// * * * 
//* * * * 
 
package operator;

import java.util.Scanner;

public class Pattern_userinput {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		//take input from user
		System.out.println("Enter any row:");
		int row=sc.nextInt();
		for(int i=1;i<=row;i++) {
			for(int j=row;j>i;j--) {
				System.out.print(" ");
			}for(int k=1;k<=i;k++) {
			System.out.print(" *");
		}
		System.out.println();
		}}}


