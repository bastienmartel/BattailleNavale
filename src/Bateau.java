
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
	private String bateau;
	private int x;
	private int y;
	
	
	public Bateau(int indice, int taille) {
		super();
		this.bateau = typeBateau[indice];
		this.taille = taille;
	}
	
	
	public String[] getTypeBateau() {
		return typeBateau;
	}
	public void setTypeBateau(String[] typeBateau) {
		this.typeBateau = typeBateau;
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
