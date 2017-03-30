package bataille;

public class Joueur {

		private String nomJoueur;
		private int score;
		private Grille[][] grilleJoueur;
		private boolean caseBateau = false;
		private Bateau bateau;
		
		
		
		public Joueur(String nomJoueur, int score, int width, int heigth )
		{
			this.nomJoueur = nomJoueur;
			this.score = score;
			grilleJoueur = new Grille[heigth][width];
			for(int j = 0 ; j < heigth ; j++)
			{
				
			
				for(int i = 0 ; i < width ; i++)
				{
					grilleJoueur[j][i].setCaseBateau(caseBateau);
				}
			}
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
