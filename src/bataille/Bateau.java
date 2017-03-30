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




	@Override
	public String toString() {
		return "Le " + bateau + " de taille " + taille + "entre dans le jeu"  ;
	}


	public int getX1() {
		return x1;
	}


	public void setX1(int x1) {
		this.x1 = x1;
	}


	public int getY1() {
		return y1;
	}


	public void setY1(int y1) {
		this.y1 = y1;
	}


	public int getX2() {
		return x2;
	}


	public void setX2(int x2) {
		this.x2 = x2;
	}


	public int getY2() {
		return y2;
	}


	public void setY2(int y2) {
		this.y2 = y2;
	}
	
	
	
	

	
	
}
