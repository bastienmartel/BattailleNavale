package bataille;

public class Joueur {

		private String nomJoueur;
		private int score;
		private Grille grilleJoueur;
		private Bateau bateau;
		
		
		
		public Joueur(String nomJoueur, int score, int width, int heigth )
		{
			this.nomJoueur = nomJoueur;
			this.score = score;
			grilleJoueur = new Grille(width,heigth);
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
		
		
		
}
