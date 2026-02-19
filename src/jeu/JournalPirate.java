package jeu;

public class JournalPirate implements Affichage {
	
	@Override
	public void afficherDes(int valeur) {	
		System.out.println("La valeur du des"+valeur);
	}

	@Override
	public void afficherPosition(int position) {
		System.out.println("La position est"+position);
		
	}

	@Override
	public void afficherVictoire(Boolean victoire) {
		System.out.println("Victoire :"+victoire);
		
	}

	@Override
	public void afficherNom(String nom) {
		System.out.println("Le nom du pirate "+nom);
		
	}

	@Override
	public void afficherCouleur(Couleur couleur) {
		System.out.println("La couleur est"+couleur );
		
	}
	
	
	

}
