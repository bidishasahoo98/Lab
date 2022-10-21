/*Problem: 2
Write a program in Java to create a file in Java using Exception Handling.*/

package operator;

 class ExceptionExample {
public void show() {
	String a="I am error";
	System.out.println(a);
	try {
		String s="Bidisha";
		System.out.println(s.length());
		int m=Integer.parseInt(s);//number format exception
		System.out.println(m);
	}
	catch(Exception e) {
		System.out.println(e);
	}
	String b="I can handle it";
	System.out.println(a+" "+b);
}
public static void main(String[] args) {
	ExceptionExample e=new ExceptionExample();
	e.show();
}
}
