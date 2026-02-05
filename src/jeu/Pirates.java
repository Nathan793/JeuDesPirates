package jeu;



public class Pirates {
	private String nom ;
	private Couleur couleur ;
	private Des des= new Des() ;
	private int position = 0, cases = 30 ;
	
	public Pirates (String nom, Couleur couleur) {
		this.nom=nom;
		this.couleur=couleur;
		
	}
	
	
		
	
	
	public int deplacement(int position,int cases) {
		int valeur = des.lancerDes() ;
		if (position<=cases) {
			position = position + valeur  ;
		}
		else 
			position = position - cases ;
		
		return position ;
	}
	
	

}
