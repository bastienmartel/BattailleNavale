package test;

import static org.junit.Assert.*;
import bataille.Bateau;
import bataille.Grille;
import bataille.Joueur;

public class TestTemplate {

	Grille g;
	Bateau b;
	Joueur j;
	@org.junit.Before
	public void setup()
	{
		g = new Grille(5, 6);
		b= new Bateau(1,5,); //porte avion de taille 5
		j= new Joueur("joueur1",0,5,6);
	}
	
	@org.junit.Test
	public void testInsertionGrille() {
		
		
		
	}
	@org.junit.Test
	public void testCreationJoueur()
	{
		assertNotNull(object);
	}

}
