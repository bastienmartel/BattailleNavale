package bataille;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
			
			Scanner s;
			s= new Scanner(System.in);
			System.out.println("Entrez la taille horizontale de la grille : \n");
			int width = s.nextInt();
			System.out.println("Entrez la taille verticale de la grille : \n");
			s.reset();
			int height = s.nextInt();
			Grille plateau = new Grille(width,height);
			
			
			
	}

}
