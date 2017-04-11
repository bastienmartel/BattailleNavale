
package bataille;

public class Grille {
	//test travis
	//test travis 2, le retour
	private int x;
	private int y;
	private int[][] tableau; //Dans le tableau, 0: la case est libre; 1:PorteAvion 2:Croiseur 3:ContreTorpilleur 4:SousMarin 6:Torpilleur
	private boolean caseBateau;
	
	/**
	 * 
	 * @param x Abscisses
	 * @param y Ordonnées
	 */
	
	public Grille(int x, int y) {
		super();
		this.x = x;
		this.y = y;
		tableau = new int[x][y];
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

	public boolean isCaseBateau() {
		return caseBateau;
	}

	public void setCaseBateau(boolean caseBateau) {
		this.caseBateau = caseBateau;
	}

}
