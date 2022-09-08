// Write a java class to develop an employee class object using constructor.The constructor hold initialized  
//the emp name & emp Id for 5 Emp.now write another class  having name and from this class you have to 
//create 5 employee objects but you are not allowed to use new keyword.

package operator;

class Employee {

	 String name;
     int id;
     Employee(int a, String n) { //parameterized constructor where we have to pass the value
  	   id=a;
  	   name=n;
  	   }
     void show() {
    	 System.out.println(id+" "+name);
}
	public static void main(String[] args) {
		Employee ob=new Employee  (15201,"Bidisha");
		Employee ob1=new Employee(15202,"Sangita");
		Employee ob2=new Employee(15203,"Mekhla");
		Employee ob3=new Employee(15204,"Astha");
		Employee ob4=new Employee(15205,"Anjali");
          ob.show();
	      ob1.show();
	      ob2.show();
	      ob3.show();
	      ob4.show();
	}

}
