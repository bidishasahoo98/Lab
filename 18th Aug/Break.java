// Write a Java program to break an integer into a sequence of individual digits.

package operator;

public class Break {

	public static void main(String[] args) {
		// initialize a
		int a = 2583;
		int digit1=(a/1000)%10;
		int digit2=(a/100)%10;
		int digit3=(a/10)%10;
		int digit4=(a%10);
  System.out.println(" break an integer into a sequence of individual digits:" + digit1 + " " + digit2 + " " +  digit3 + " " + digit4);
	}

}
