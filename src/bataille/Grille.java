
package bataille;

public class Grille {
	
	private int x;
	private int y;
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
