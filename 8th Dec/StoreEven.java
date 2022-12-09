package Demo;
import java.util.ArrayList;

	public class StoreEven {
	   ArrayList<Integer> list = new ArrayList<Integer>();//create int type arraylist
	   public ArrayList<Integer> saveEvenNumbers(int N) {//methods to print even number
			for (int i = 2; i <= N; i++) {
				if (i % 2 == 0) list.add(i);
				}
			return list;//return the list
		}
	   ArrayList<Integer> newList = new ArrayList<Integer>();
		public ArrayList<Integer> printEvenNumbers() { //method of print newlist
			 for (int item : list) {//traversing the list
				newList.add(item * 2);
				System.out.println(item * 2);
			}
			  return newList;
		}
		public void retrivevalue (int find) {
			if(newList.contains(find)) { //check the new list contains the contains
				System.out.println("present element in arraylist");
		}}
		
		public static void main(String[] args) {
			StoreEven ob=new StoreEven();
			ob.saveEvenNumbers(10);
			ob.printEvenNumbers();
			ob.retrivevalue(4);
		}}	
		
		

