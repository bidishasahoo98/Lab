/*Problem 2. 
Banking Operations create a class with customer private instance variables as accountNumber,accountName,accountBalance and 
create methods as
1. create account => accnumber,accname,accbal
2. setAmount=> add amount to accbal
3. getAmount=>print accbal and name account
4. withDrawAmount()=to withdraw amount from accBalance
create a main class to use customer and create atleast two customers*/


package Assignment;
class customer{
	int accountNumber;
	double accountBalance;
	String accountName;
	double amount;
	public void createaccount(int accountNumber,String accountName,double accountBalance) { //for creating account
		 this.accountNumber=accountNumber;
		 this.accountName=accountName;
		 this.accountBalance=accountBalance;
		 }
	public void getAmount() { //for print account details
		System.out.println("Account Holder: "+accountName);
		System.out.println("Account Balance: "+accountBalance);
	}
	public void setAmount(double amount ) { //for adding amount
		System.out.println("");
		accountBalance=accountBalance+amount;
		System.out.println("Updated balance is: "+accountBalance);
				}
public void withdrawAmount (double amount) { //for withdraw
	accountBalance=accountBalance-amount;
	System.out.println("withdraw of "+amount +"is successful");
	System.out.println("Now new balance is: "+accountBalance);
}}
public class Bank {
	public static void main(String[] args) {
		customer ob=new customer();
		ob.createaccount(706083929,"Bidisha Sahoo",80000.00);
		ob.setAmount(20000.00);
		ob.getAmount();
		ob.withdrawAmount(200.00);
		System.out.println();
		customer ob1=new customer();
		ob1.createaccount(706083920,"Aniruddha Sahoo",90000.00);
		ob1.setAmount(100000.00);
		ob1.getAmount();
		ob1.withdrawAmount(100000.00);
			}

}
