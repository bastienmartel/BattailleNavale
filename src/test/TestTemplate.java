package test;

import static org.junit.Assert.*;
import bataille.Bateau;
import bataille.Grille;

public class TestTemplate {

	Grille g;
	Bateau b;
	
	@org.junit.Before
	public void setup()
	{
		g = new Grille(5, 6);
		b= new Bateau(1,5); //porte avion de taille 5
		
	}
	
	@org.junit.Test
	public void testInsertionGrille() {
		
		
		
	}
	@org.junit.Test
	public void test()
	{
		
	}

}
