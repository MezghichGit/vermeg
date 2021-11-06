package vermeg_oca.chapter4;

public class Test {
	public static void main(String[] args) {
		/*ImpPrediction imp = new ImpPrediction();
		boolean res = imp.test("ocaocp");
		
		Imp2 imp2 = new Imp2();
		boolean res2 =imp2.test("oca");
		
		System.out.println(res);
		System.out.println(res2);*/
		
		/*Prediction p = (String s)->{return s.length()==3;};
		System.out.println(p.test("ocap"));
		Prediction p2 = (String s)->{return s.contains("oca");};
		System.out.println(p2.test("oca"));*/
		
		/*outer:for(int i=0; i<10; i++)
		{
		 inner:for(int j=0; j<10;j++)
		 {
			 if(j==5) continue outer;
			 System.out.println(i+","+j);
		 }
		}
		System.out.println("Suite du programme");*/
		/*
		String tab[] = {"oca","ocp","spring","spring boot","angular","git","junit","uml","xml"};
	 for(String c : tab)
	 {
		 System.out.println(c);
	 }*/
		/*int x = 10, y =20, z=30;
		int res = (x>y)?1:-1;
		boolean res2 = (x>z)?true:false;
		System.out.println((x>z)?10:false);*/
		int dayOfWeek = 5;
		final int  x = 10;
		String nom="abc";
		switch(dayOfWeek) {
		
		case x :System.out.println("Sunday");break;
		
		case 0:System.out.println("Sunday");break;
		
		case 6:System.out.println("Saturday");break;
		default : System.out.println("Weekday");
		
		
		} 
	
	}
}
