//Consider a scenario where Bank is a class that provides functionality to get the rate of interest. However, the rate of interest varies
 //according to banks. For example, SBI, ICICI and AXIS banks could provide 8%, 7%, and 9% rate of interest.
package operator;
class Bank{
float rateofinterest() {
	return 0;
}}
class SBI extends Bank{
	float rateofinterest() {
		return 8;
		}}
class ICICI extends Bank{
	float rateofinterest() {
		return 7;}}
class AXIS extends Bank{
	float rateofinterest() {
		return 9;}}
public class RateofInterest {
       public static void main(String[] args) {
		SBI sb=new SBI();
		ICICI ic=new ICICI();
		AXIS ax=new AXIS();
		 System.out.println("Rate of interest of SBI bank is "+sb.rateofinterest());
		 System.out.println("Rate of interest of SBI bank is "+ic.rateofinterest());
		 System.out.println("Rate of interest of SBI bank is "+ax.rateofinterest());

	}}

