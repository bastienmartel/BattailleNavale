package bataille;

/*public enum typeBateau{
	PorteAvion("Porte Avion"),
	Croiseur("Croiseur"),
	ContreTorpilleurs("Contre Torpilleurs"),
	SousMarin("Sous Marin"),
	Torpilleur("Torpilleur");
}*/
public class Bateau {
	private static String[] typeBateau = {"Porte Avion","Croiseur","Contre Torpilleurs","Sous Marin","Torpilleur"};
	private int taille;
	private String bateau; // Nom du Bateau
	private int x1, y1, x2, y2;
	
	private int toucher;
	
	/**
	 * 
	 * @param indice Indice du Bateau 1:PorteAvion 2:Croiseur 3:ContreTorpilleur 4:SousMarin 6:Torpilleur
	 * @param taille Taille du bateau
	 * @param x1  abscisse début du bateau
	 * @param y1  ordonnée début du bateau
	 * @param x2  abscisse fin du bateau
	 * @param y2  ordonnée fin du bateau
	 * 
	 */
	public Bateau(int indice, int taille,int x1, int y1, int x2, int y2) {
		super();
		this.bateau = typeBateau[indice];
		this.taille = taille;
		this.x1= x1;
		this.y1= y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	
	
	public String[] getTypeBateau() {
		return typeBateau;
	}
	public void setTypeBateau(String[] typeBateau) {
		Bateau.typeBateau = typeBateau;
	}
	public int getTaille() {
		return taille;
	}
	public void setTaille(int taille) {
		this.taille = taille;
	}


	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}


	@Override
	public String toString() {
		return "Le " + bateau + " de taille " + taille + "entre dans le jeu"  ;
	}
	
	
	
	

	
	
}
