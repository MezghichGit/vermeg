package vermeg_oca.chapter4;

public interface Vehicule {
	
	public abstract void info();
	
	public default void affichage() {
		System.out.println("affichage");
	}
	
	public static void affichage2() {
		
	}

}
