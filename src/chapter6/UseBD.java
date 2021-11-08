package chapter6;

public class UseBD {

	public static void main(String[] args) {//throws Exception{
	
		try {
			ConnexionBD.getConnexionBD();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ConnexionBD.getInfoBD();
		
		System.out.println("Fin du programme");

	}

}
