//… Write the following code:1. A class named Arithmetic with a method named add that takes integers as parameters and returns an integer1
//denoting their sum.2. A class named Adder that inherits from a superclass named Arithmetic
//test your submission by calling the add method on an Adder object and passing it integer parameters.

package operator;

class Arithmetic{
	int add(int a,int b) {
		 return(a+b);
	}}
class Adder extends Arithmetic {

	public static void main(String[] args) {
		Adder ob=new Adder();
        System.out.println(ob.add(5, 3));
	}
}
