/*Problem: 3
Write a program to create custom exception in java. */

package operator;

import java.util.Scanner;

class InvalidAgeException extends Exception{
	public InvalidAgeException(String str) {
		super(str);
	}}
 class CustomException {
public void checkAge(int age)throws InvalidAgeException{
	if(age<18 || age>26) {
		throw new InvalidAgeException("Invalid age for enrolling into JAVA course");
	}else {
		System.out.println("Proper age for enrolling into JAVA course ");
	}}
	public static void main(String[] args) throws InvalidAgeException{
		CustomException c= new CustomException();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		c.checkAge(age);
		}}
