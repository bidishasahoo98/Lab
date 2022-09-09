package operator;

class Employee { // creating class to initialize ids and names
	static void info(int eid, String ename) {
		System.out.println("Employee ID : " + eid + ", " + "Employee name : " + ename );
	}
}
public class EmployeeInfo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee.info(1,"Sankalpa"); // calling mthods WITHOUT USING NEW KEYWORD
		Employee.info(2,"Debkanta");
		Employee.info(3,"Arnab");
		Employee.info(4,"Sarbajit");
		Employee.info(5,"Shreya");
	}}
