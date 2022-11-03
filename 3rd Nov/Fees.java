package operator;

public class Fees {
	public void validateFees(Double Fees) {  // method for checking fees is infinite or not
        if(Fees.isInfinite()) { // condition check
           System.out.println("Fees is infinite");
        }
       else{
           System.out.println("Fees is not infinite");
       }
        System.out.println(Fees.byteValue());  //print byte value of fees
    }
	
	public static void main(String[] args) { 	// main method 
		
		Fees ob = new Fees();					//object of the Student class
        ob.validateFees(99999d);
}}