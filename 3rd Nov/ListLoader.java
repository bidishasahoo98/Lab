//Thread: Problem 1

package operator;

import java.util.ArrayList;

public class ListLoader { //class
public void Loadlist(int startNumber,int lastNumber) { //Method Name with Method Arguments(Integer startNumber, Integer lastNumber)

	ArrayList<Integer> L=new ArrayList<Integer>(); //load an array list (L) with the Integer numbers
	for(int i=startNumber;i<=lastNumber;i++) {
		L.add(i);
	}
}
	public static void main(String[] args) {
		ListLoader ob=new ListLoader(); //creating object 
		int a=(int)System.currentTimeMillis(); //time taken before run the method 
		System.out.println("time taken before run the method :" +a);
		ob.Loadlist(0, 10000000);
		int b=(int)System.currentTimeMillis();//time taken after run the method 
		System.out.println("time taken after run the method:" +b);
		System.out.println("before and after the method execution response time:"+(b-a));
	}

}
