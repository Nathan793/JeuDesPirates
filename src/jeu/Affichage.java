package jeu;

public interface Affichage {
	
	public void afficherDes(int valeur) ;
	
	public void afficherPosition(int position);
	public void afficherPv(int pv);
	
	public void afficherVictoire(Boolean victoire );
	
	public void afficherNom(String nom);
	
	public void afficherCouleur(Couleur couleur); 
	public void afficherArme(Case arme) ;
	public void afficherFilet(Case c);
	public void attendreTour(String nom);
	public void afficherBouclier(Boolean bouclier) ;
		
	
	

}
