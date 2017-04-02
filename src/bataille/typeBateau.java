package bataille;

public enum typeBateau
{
	PorteAvion("Porte Avion", 5),
	Croiseur("Croiseur", 4 ),
	ContreTorpilleurs("Contre Torpilleurs",3),
	SousMarin("Sous-marin",2),
	Torpilleur("Torpilleur",1);
	
	private String name="";
	private int taille;
	
	private typeBateau(String name, int taille){
		this.name= name;
		this.taille= taille;
	}
	
	public void afficheListe(){
		for(typeBateau t : typeBateau.values()){
			System.out.println(t.name);
		}
	}
}
