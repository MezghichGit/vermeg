package vermeg_oca.chapter5;
import vermeg_oca.chapter4.Personne;
public class Test {

	
	public static void somme(short x, short y)
	{
		System.out.println("short x, short y");
	}
	
	/*public static void somme(int x, int y)
	{
		System.out.println("int x, int y");
	}*/
	
	/*public static void somme(long x, long y)
	{
		System.out.println("long x, long y");
	}*/
	/*public static void somme(float x, float y)
	{
		System.out.println("float x, float y");
	}*/
	/*public static void somme(double x, double y)
	{
		System.out.println("double x, double y");
	}*/
	
	public static void somme(Integer x, Integer y)
	{
		System.out.println("Integer x, Integer y");
	}
	
	public static void somme(int ... x)
	{
		System.out.println("int ... x");
	}
	
	public static void main(String[] args) {
		somme(10,20);
		/*Personne p = new Personne();
		Professor pr = new Professor();
		p.zipCode =2000;*/
	

	}

}
