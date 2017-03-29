package bataille;

public class Joueur {

		private String nomJoueur;
		private int score;
		
		
		
		public Joueur(String nomJoueur, int score)
		{
			this.nomJoueur = nomJoueur;
			this.score = score;
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
