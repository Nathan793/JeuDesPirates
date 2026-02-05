package jeu;



public class Pirates {
	private String nom ;
	private Couleur couleur ;
	private Des des= new Des() ;
	
	public Pirates (String nom, Couleur couleur) {
		this.nom=nom;
		this.couleur=couleur;
		
	}
	
	
		
	
	
	public int deplacement() {
		int valeur = des.lancerDes() ;
		int cases = 30 ;
		int position = 0;
		if (position<=cases) {
			position = position + valeur  ;
		}
		else 
			position = position - cases ;
		
		return position ;
	}
	
	

}
