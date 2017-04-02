package bataille;

public class Bateau {
	//private static String[] typesBateau = {"Porte Avion","Croiseur","Contre Torpilleurs","Sous Marin","Torpilleur"};
	private int taille;
	private typeBateau nomBateau; // Nom du Bateau
	
	/**
	 * @param nomBateau :nom du bateau pris dans l'énumération
	 * @param taille Taille du bateau
	 */
	public Bateau(typeBateau nomBateau, int taille) {
		super();
		this.nomBateau = nomBateau;
		this.taille = taille;
		
	}
	
	
	public int getTaille() {
		return taille;
	}
	public void setTaille(int taille) {
		this.taille = taille;
	}


	@Override
	public String toString() {
		return "Le " + nomBateau + " de taille " + taille + "entre dans le jeu"  ;
	}


	
	

	
	
}
