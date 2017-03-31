package test;

import static org.junit.Assert.*;
import bataille.Bateau;
import bataille.Grille;
import bataille.Joueur;

public class TestTemplate {

	Grille g;
	Bateau b;
	Joueur j;
	Joueur j2;
	@org.junit.Before
	public void setup()
	{
		g = new Grille(5, 6);
		b= new Bateau(1,5,1,2,6,2); //porte avion de taille 5
		j= new Joueur("joueur1",5,6);
		j2= new Joueur("joueur2",5,6);
	}
	
	@org.junit.Test
	public void testTailleBateauVertical() {
		assertEquals(5,(b.getX2() - b.getX1()));
	}
	
	@org.junit.Test
	public void testTailleBateauHorizontal() {
		assertEquals(5,(b.getY2() - b.getY1()));
	}
	
	@org.junit.Test
	public void testTypeBateau() {
		assertEquals("Porte Avion", b.getTypeBateau());
	}
	
	@org.junit.Test
	public void testCreationJoueur()
	{
		
	}

}
