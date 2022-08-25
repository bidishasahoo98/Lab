//   *
//  * *
// * * * 
//* * * * 
 
package operator;

import java.util.Scanner;

public class Pattern_userinput {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		//take input from user
		System.out.println("Enter any row:");
		int row=input.nextInt();
		for(int i=1;i<=row;i++) {
			for(int j=row;j>i;j--) {
				System.out.print(" ");
			}for(int k=1;k<=(i*2)-1;k++) {
			System.out.print("*");
		}
		System.out.println();
		}}}


