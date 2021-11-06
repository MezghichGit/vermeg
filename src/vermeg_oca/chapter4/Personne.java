package vermeg_oca.chapter4;

public class Personne {
	
	public Personne() {
		this(10);
		System.out.println("defaut");
	}
	public Personne(int age) {
		System.out.println("int age");
	}
	public Personne(String name) {
		this(10);
		System.out.println("String name");
	}
	
	private int age;
	String name;  // default(package private)
	
	protected String adresse;
	public int zipCode;
	
	
	public void info(int age)
	{
		System.out.println(this.age);
	}
	public void info(double age)
	{
		System.out.println(this.age);
	}
	

}
