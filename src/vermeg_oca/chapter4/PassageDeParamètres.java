package vermeg_oca.chapter4;

public class PassageDeParamètres {

	public static void permut(int a , int b)
	{
		System.out.println("a = "+a+" b="+b);
		int temp;
		 temp =a;
		 a=b;
		 b=temp;
		 System.out.println("a = "+a+" b="+b);
	}
	
	public static void modifString(String ch) {
		ch = ch.concat("-ocp");
	}
	public static void modifStringBuilder(StringBuilder sb) {
		sb.append("-ocp");
	}
	public static void main(String[] args) {
		StringBuilder s = new StringBuilder("oca");
		modifStringBuilder(s);
		System.out.println(s);
		//String mot = "oca";
		//modifString(mot);
		//System.out.println(mot);
		
		/*int x = 10, y =20;
		permut(x,y);
		System.out.println("x = "+x+" y="+y);*/

	}

}
