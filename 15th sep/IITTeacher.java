// In this example, you have a base class Teacher and a sub class ITTeacher. Since class ITTeacher extends the designation
// and college properties and work () method from base class, we need not to declare these properties and method in sub class.
//Here we have college Name, designation and work () method which are common to all the teachers so we have declared them in the base class, this way the child classes like Math 
//Teacher, Music Teacher and PhysicsTeacher do not need to write this code and can be used directly from base class.


package operator;
class Teacher{
	String designation="Teacher";
	String collegename="MSIT";
	void work() {
		System.out.println("Teacher teaches us");
	}
}
public class IITTeacher extends Teacher{
	String mainSubject="Machine";
	public static void main(String[] args) {
		IITTeacher  iit=new IITTeacher();
		System.out.println(iit.collegename);
		System.out.println(iit.designation);
		System.out.println(iit.mainSubject);
         iit.work();
	}

}
