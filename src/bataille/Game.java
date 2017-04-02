package bataille;

import java.util.EnumSet;
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
			System.out.println("Entrez le type du bateau parmi : \n" );
			for(typeBateau t : typeBateau.values()){
				System.out.println(t.ordinal() + t + "\n");
			}
			
			
			
	}

}
