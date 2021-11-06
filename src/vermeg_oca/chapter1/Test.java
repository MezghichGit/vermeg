package vermeg_oca.chapter1;

import vermeg_oca.chapter2.*;
import vermeg_oca.chapter3.A;
import vermeg_oca.chapter3.*;
public class Test {

	public static void main(String[] args) {
		A a;
		B b;
		C c;
		E e;
		F f;
		int k;
		
		Animal a1 = new Animal();
		Oiseau o = new Oiseau();
		boolean res1 = a1 instanceof Animal;
		boolean res2 = o instanceof Animal;
		System.out.println(res1 +" "+res2);
		String cours = "oca";
		System.out.println(cours.concat("ocp"));
		System.out.println(cours);
		StringBuilder sb = new StringBuilder("oca");
	
		System.out.println(sb.append("ocp"));
		System.out.println(sb);
		/*Animal a2 = new Animal();*/
		/*Animal a1 = new Animal();
		System.out.println(a1.nom);
		System.out.println(a1.age);
		System.out.println(Animal.nb);
		//System.out.println(k);
		byte x = 127;
		int $x=100;
		System.out.println($x);
		
		//9223372036854775807
		
		//int h = 011;  // 0x, 0X : base hexadecimal; 0b 0B : base binaire; 0 base octale
		//System.out.println(h);
		//int w = 1_000_000;
		/*long y = 92233720_368_547L;
		float v = 12.5F;
		double k = 12.5;*/
		
		
		/*System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);*/

	}

}
