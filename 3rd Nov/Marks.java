//Wrapper Class:Problem 2

package operator;

class Marks{
public static void compareMarks(long Maths, double English) {	 // method to compare marks
		
		//criteria
		if((int)English > (int)Maths) {
			System.out.println("English mark is higher than Maths"); 
		}
		else if((int)Maths > (int)English) {
			System.out.println("Maths mark is higher than English");
		}
		else if((int)English == (int)Maths) {
			System.out.println("Both are equal");
		}}
		public static void main(String[] args) { 					// main method 
			Marks ob = new Marks();		
			ob.compareMarks(85,65);
			ob.compareMarks(56,98);
			ob.compareMarks(84,84); //object of the Marks class
	}}