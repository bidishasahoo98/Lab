// In this example, you have a base class Teacher and a sub class ITTeacher. Since class ITTeacher extends the designation
// and college properties and work () method from base class, we need not to declare these properties and method in sub class.
//Here we have college Name, designation and work () method which are common to all the teachers so we have declared them in the base class, this way the child classes like Math 
//Teacher, Music Teacher and PhysicsTeacher do not need to write this code and can be used directly from base class.


package operator;
class Teacher{
	public void designation() {
	System.out.println("Teacher");
	}
	public void  collegename() {
		System.out.println("MSIT");
	}
	void work() {
		System.out.println("Teacher teaches us");
	}
}
 class IITTeacher extends Teacher{
	public void details() {
		super.collegename();
		super.designation();
		super.work();
	}}
 class MusicTeacher extends Teacher{
	public void details() {
		super.collegename();
		super.designation();
		super.work();
	}}
 class PhysicsTeacher extends Teacher{
	public void details() {
		super.collegename();
		super.designation();
		super.work();
	}}
public class IIT{
	public static void main(String[] args) {
		IITTeacher  iit=new IITTeacher();
		MusicTeacher m=new MusicTeacher();
		PhysicsTeacher p=new PhysicsTeacher();
		iit.details();
		m.details();
		p.details();
	}
}

