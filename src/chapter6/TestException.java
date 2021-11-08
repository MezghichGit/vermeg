package chapter6;

public class TestException {

	public static void main(String[] args) {
		int x = 10;
		int y = 0;
		// 
		// int tab[]= {10,2,14};
		String ch = "oca";
		try {
			System.out.println(ch.length());
			System.out.println(x/y);
		} 
		catch (NullPointerException ex) {
			System.out.println("Probleme Reference sur Null");
		}
		
		catch (Exception ex) {
			System.out.println("Probleme : " + ex.getMessage());
			ex.printStackTrace();
			return;
		}
		// System.out.println(tab[3]);
		finally{
		System.out.println("Suite du programme");
		}

	}

}
