package vermeg_oca.chapter5;

public class Polymorphisme {

	public static void main(String[] args) {
		Student s = new Student();
		Doctor d = new Doctor();
		//s = d;  //Upcasting OK
		//d=s;// DownCastiong OK
		
		d=(Doctor)s;
		

	}

}
