/*Class A serves as a base class for the derived class B, which in turn serves as a base class for the derived class C. (Which type Of 
  Inheritance explain with an example)*/

//  This is example of Multilevel-Inheritance
package operator;

class Exam1 {
int marks() {
	return 0;
}}
class Biology extends Exam1{
	int marks() {
		return 80;
}}
class Chemistry extends Exam1{
	int marks() {
		return 70;
}}
class Physics extends Exam1{
	int marks() {
		return 50;
}}
public class Multiple {
	public static void main(String[] args) {
		Biology c=new Biology();
		Chemistry m=new Chemistry();
		Physics s=new Physics();
		System.out.println("Biology marks is:"+c.marks());
		System.out.println("Chemistry marks is:"+m.marks());
		System.out.println("Physics marks is:"+s.marks());
}}
