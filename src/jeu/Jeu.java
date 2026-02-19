package jeu;

public class Jeu {
	private Affichage journal;
	Pirates fernando = new Pirates("Fernando", Couleur.BLEU) ;
	Pirates romuald = new Pirates("Romuald", Couleur.ROUGE) ;
	Des des = new Des();

	public Jeu (Affichage journal) {
		this.journal=journal;
		
		
	}
	
	public void lancerJeu() {
		
		do {
			journal.afficherNom(fernando.getNom()) ;
			journal. afficherDes(fernando.getValeur());
			fernando.deplacement();
			journal.afficherPosition(fernando.getPosition());
			journal.afficherVictoire(fernando.getVictoire());
			
			
			
			journal.afficherNom(romuald.getNom()) ;
			journal. afficherDes(fernando.getValeur());
			romuald.deplacement();
			journal.afficherPosition(romuald.getPosition());
			journal.afficherVictoire(romuald.getVictoire());
		
		}while(!(romuald.getVictoire()) && !(fernando.getVictoire()));
		


		
	}

}
