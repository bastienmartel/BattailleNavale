package bataille;

import java.util.*;


public class Joueur {

		private String nomJoueur;
		private int score;
		private Grille[][] grilleJoueur;
		private boolean caseBateau = false;	
		ArrayList<Bateau> listBateau;

		
		public Joueur(String nomJoueur,int width, int heigth )
		{
			this.nomJoueur = nomJoueur;
			this.score = 0;
			grilleJoueur = new Grille[heigth][width];
			for(int j = 0 ; j < heigth ; j++)
			{	
				for(int i = 0 ; i < width ; i++)
				{
					grilleJoueur[j][i].setCaseBateau(caseBateau);
				}
			}
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
		
		public void addBateau(int indice, int taille,int x1, int y1, int x2, int y2){
			listBateau.add(new Bateau(indice, taille, x1, y1, x2, y2));
			
			/* Désolé c'est degueulasse !!!!*/
			
			/* Le premier if sert a savoir si le bateau est à l'horizontale ou verticale*/
			/* Si c'est horizontale*/
			if(x1==x2){
				/*Le deuxième if sert a savoir dans quelle sens il est rentrer*/
				if(y1>y2){
					/* Le for sert a remplir les case du tableau*/
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
				/* Si le bateau est verticale alors : */
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

		}
		
		public String getList(){
			String message = null;
			for (Bateau bateau : listBateau){
				message+= bateau.toString();
			}
			return message;
		}
		public boolean tirerMissile(Joueur cible, int positionX, int positionY) {
			if(cible.grilleJoueur[positionY][positionX].isCaseBateau())
			{
				caseBateau = true;
			}else
			{
				caseBateau = false;
			}
			return caseBateau;
		}
		
}
