package jeu;

public class Jeu {
	private Affichage journal;
	Pirates fernando = new Pirates("Fernando", Couleur.BLEU) ;
	Pirates romuald = new Pirates("Romuald", Couleur.ROUGE) ;

	public Jeu (Affichage journal) {
		this.journal=journal;
		
		
	}
	
	public void lancerJeu() {
	PiratesafficherDes();
		
	afficherPosition();
	
	afficherVictoire();

	afficherNom() ;
		
	afficherCouleur();

		
	}

}
