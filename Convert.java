// Write a Java program to convert minutes into a number of years and days.


package operator;

import java.util.Scanner;

public class Convert {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number of mins: ");
int mins= sc.nextInt();
int a =60*24*365;
int years = mins/a;
int days= (mins/60/24)%365;
System.out.println(mins + " mins " + years + " years and " +days + " days ");
	}

}
