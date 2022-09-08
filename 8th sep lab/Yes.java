//Can you create object of a class from inside the scope of another class constructor.
// ans: YES

package operator;

 class Hard {
	  
	    }
	   public class Yes{
		   Yes(){
			   Hard hard=new Hard(); // create obj 
		   }
	    public static void main(String args[]){
	    Yes ob=new Yes();
	    }}

	
