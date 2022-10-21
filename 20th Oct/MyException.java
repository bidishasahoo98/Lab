package operator;

import java.util.Scanner;
class ProgramException extends Exception{
	public ProgramException(String code) {
		super(code);}}

public class MyException {  //class with main method
public static void main(String[] args) {
{try { int a=52/0; //Arithmetic Exception
	System.out.println(a);}
catch(ArithmeticException e) {
	System.out.println("Invalid division");}}

{try {
	String s="Hello";
	int num=Integer.parseInt(s);
	System.out.println(num);} //NumberFormatException
catch(NumberFormatException e1){
	System.out.println("Format mismatch");}}

{try {int array[]=new int[4];
array[7]=50;   //ArrayIndexOutOfBoundsException
System.out.println(array[7]);}
catch(ArrayIndexOutOfBoundsException e2) {
System.out.println("Array index is invalid");}}
System.out.println("Exception Handling Completed");
}}