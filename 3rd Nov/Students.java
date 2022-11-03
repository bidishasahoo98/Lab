//Wrapper class:Problem 1

package operator;

public class Students {
	public void calculateFeesStructure(long studentId, char studentGrade, double monthlyFees, boolean isScholarshipEligible) {		 	// method to calculate fees
//checking criteria
if(studentId!=0 && studentGrade=='A' && isScholarshipEligible==true) {		//checking if the grade is A
	 double fees =monthlyFees -monthlyFees *10/100;
	 System.out.println("10% of fees is exempted, the calculated fees is  " + (int)fees);
}
else if (studentId!=0 && studentGrade=='B' && isScholarshipEligible==true) {  //checking if the grade is B
	 double fees =monthlyFees -monthlyFees * 8/100 ; 
	 System.out.println("8% of fees is exempted, the calculated fees is  " + (int)fees);
}
else if (studentId!=0 && studentGrade=='C' && isScholarshipEligible==true) { //checking if the grade is C
	 double fees =monthlyFees -monthlyFees * 6/100 ; 
	 System.out.println("6% of fees is exempted, the calculated fees is  " + (int)fees);
}
else if (studentId!=0 && studentGrade=='D' && isScholarshipEligible==true) { //checking if the grade is D
	 double fees =monthlyFees -monthlyFees * 4/100 ; 
	 System.out.println("4% of fees is exempted, the calculated fees is  " + (int)fees);
}
else {												//if none of the condition is satisfied
	System.out.println("Not Eligible for Exemption"); }
}
public static void main(String[] args) { 					// main method 
	
	Students ob = new Students();					//object of the Students class
	
	//calling method with arguments
	ob.calculateFeesStructure(234,'C',600,true);	
	ob.calculateFeesStructure(115,'B',909.50,true);
	ob.calculateFeesStructure(980,'G',1810,false);
}}