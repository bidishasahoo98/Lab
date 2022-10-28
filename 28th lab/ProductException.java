/*Q.2 Take two numbers x and y. Throw the exception if the two numbers are negative 
else print the product of x and y */

package operator;
import java.util.Scanner;//importing Scanner class
public class ProductException {
	public int Product(int a,int b) throws Exception{
            if (  a==0 && b==0)//condition checking according to question
            throw new Exception("a and b should not be negetive");//throwing user define exception
            else  if(a < 0 || b < 0)//condition checking according to question
                throw new Exception("a or b should not be negative.");//throwing user define exception

        else
        	return a*b;//returning the result of product
        }
	 public static void main(String[] args) {//main method
			Scanner scan=new Scanner(System.in);//object of Scanner class
			ProductException en=new ProductException();//creating object of ExceptionNew class
			System.out.println("enter the input values of a and b : ");
			int a=scan.nextInt();//taking input for a
			int b=scan.nextInt();//taking input for b
			try {
				System.out.println("the result of product is : "+en.Product(a, b));// to get the result
			} catch (Exception e) {
				e.printStackTrace();//printing the Exception message
			}
	 }}