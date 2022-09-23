/* 2. Write a java program to illustrate the Calculator class with addition, subtraction,
   multiplication methods that can take any number of parameters to perform the operation,
    without using method/constructor overloading.*/


package operator;
import java.util.Scanner;

class Calculator{
	public static void main(String[]args) {
		double num1, num2;
		  // Take input from the user
        Scanner sc = new Scanner(System.in);
       System.out.print("Enter the numbers : ");
         // take the inputs
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();
       System.out.println("addition is:"+addition(num1,num2));
       System.out.println("substraction is:"+substraction(num1,num2));
       System.out.println("product is: "+ multiplication(num1,num2));
	}
	public static double addition(double num1,double num2) {
		return num1+num2;
}
	public static double substraction(double num1,double num2) {
		return num1-num2;
}
	public static double multiplication(double num1,double num2) {
		return num1*num2;
}
}