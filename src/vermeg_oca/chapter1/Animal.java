package vermeg_oca.chapter1;

import java.util.Date;

public  class Animal extends Object{
	
	String nom;  // attribut d'instance
	int age; // attribut d'instance
	Date dateNaissance; // attribut d'instance
	static int nb;  // attribut de classe
	public  void info() {
		System.out.println("Animal");
	}
	public Animal()
	{
		System.out.println("Construct par défaut");
	}
	public Animal(String nom)
	{
		System.out.println("Construct avec 1 param");
	}
	
	public Animal(String nom, int age)
	{
		System.out.println("Construct avec 2 param");
	}
	
	//bloc d'initilisation d'instance
	{
		System.out.println("Un bloc d'initialisation d'instance");
	}
	
	//bloc d'initilisation de classe
	static {
		System.out.println("Un bloc d'initialisation de classe");
	}

	public void finalize()
	{
		System.out.println("Destruction");
	}
	@Override
	public String toString() {
		return "New Animal";
	}
	


}
