// you will make a class ‘Rectangle’ and declare the variable length and breadth as private. One Constructor will be
// used for initializing the value of variables. When an object is created, the constructor will be called and
// the default value of the instance variables will be assigned. Now create another new class ‘RectangleTest’ & create an object
// of class Rectangle and assign values of the parameter used in constructor. Calculate area of the rectangle and print 
// it on the console.

package operator;
import java.util.Scanner;
public class RectangleTest {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); //scanner class 
		System.out.println("Enter the length:");
		int l1=sc.nextInt();
		System.out.println("Enter the breadth:");
		int b1=sc.nextInt();
		System.out.println("Enter the 2nd length:");
		int l2=sc.nextInt();
		System.out.println("Enter the 2nd breadth:");
		int b2=sc.nextInt();
		Rectangle ob= new Rectangle(l1,b1);
		Rectangle ob1= new Rectangle(l2,b2);
		ob.area( );
		ob1.area( );}}
class Rectangle{
	private int length;
	private int breadth;
	Rectangle(int l,int b){
		length=l;
		breadth=b;}
	void area() {
		System.out.println((length*breadth));
	}
}
