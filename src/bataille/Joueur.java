package bataille;

import java.util.*;


public class Joueur {

		private String nomJoueur;
		private int score;
		private Grille grilleJoueur;
		ArrayList<Bateau> listBateau;

		
		public Joueur(String nomJoueur)
		{
			this.nomJoueur = nomJoueur;
			this.score = 0;
			grilleJoueur = new Grille(4,4);
			listBateau = new ArrayList<>();
		}
		public String getNomJoueur()
		{
			return nomJoueur;
		}
		public void setNomJoueur(String nomJoueur)
		{
			this.nomJoueur = nomJoueur;
		}
		public int getScore()
		{
			return score;
		}
		public void setScore(int score)
		{
			this.score = score;
		}
		
		/*public void addBateau(int indice, int taille){
			listBateau.add(new Bateau(indice, taille));
			
			 Désolé c'est degueulasse !!!!
			
			 Le premier if sert a savoir si le bateau est à l'horizontale ou verticale
			 Si c'est horizontale
			if(x1==x2){
				Le deuxième if sert a savoir dans quelle sens il est rentrer
				if(y1>y2){
					 Le for sert a remplir les case du tableau
					for(int j = y2 ; j < y1 ; j++)
					{	
							grilleJoueur[j][x1].setCaseBateau(true);
					}	
				}
				else{
					for(int j = y1 ; j < y2 ; j--)
					{	
							grilleJoueur[j][x1].setCaseBateau(true);
					}	
				}				
			}
			else {
				 Si le bateau est verticale alors : 
				if(x1>x2){
					for(int j = x2 ; j < x1 ; j++)
					{
					grilleJoueur[j][y1].setCaseBateau(true);
					}					
				}
				else{
					for(int j = x1 ; j < x2 ; j--)
					{
					grilleJoueur[j][y1].setCaseBateau(true);
					}	
				}
				
			}

		}*/
		
		public String getList(){
			String message = null;
			for (Bateau bateau : listBateau){
				message+= bateau.toString();
			}
			return message;
		}
		/*public boolean tirerMissile(Joueur cible, int positionX, int positionY) {
			if(cible.grilleJoueur[positionY][positionX].isCaseBateau())
			{
				caseBateau = true;
			}else
			{
				caseBateau = false;
			}
			return caseBateau;
		}
		*/
}
