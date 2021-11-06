package vermeg_oca.chapter3;

//public class Student extends Object implements Comparable{
public class Student extends Object {	
	int id;
	@Override
	public boolean equals(Object o)
	{

		Student temp = (Student)o;
		return this.id == temp.id;

	}
	@Override
	public String toString() {
		return "Student [id=" + id + "]";
	}
	public Student(int id) {this.id = id;}
	/*@Override
	public int compareTo(Object o) {
		Student temp = (Student)o;
		return this.id - temp.id;
	}*/

}
