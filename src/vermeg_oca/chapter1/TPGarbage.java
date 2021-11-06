package vermeg_oca.chapter1;

public class TPGarbage {
	public  int somme(int x, int... t) {
		int res = 0;
		for (int i = 0; i < t.length; i++) {
			res += t[i];
		}
		System.out.println(res);
		return res;
	}

	public  static final void main(String ... args) {
		/*TPGarbage v = new TPGarbage();
		v.somme(4);
		v.somme(12);
		v.somme(1,4,3,8);*/
		
		Animal a1 = new Animal();
		//System.out.println(a1);
		System.out.println(a1.toString());
		 
		/*
		 * Animal a2 = new Animal(); Animal a3 = new Animal(); a1 = null; a3=a2;
		 * //System.gc(); // appel au garbage collector for(int i=0; i<1000;i++)
		 * {System.out.println(i);}
		 * 
		 * System.out.println("Suite du programme....");
		 */
	}
}
