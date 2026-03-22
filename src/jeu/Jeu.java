package jeu;

public class Jeu {
	private Affichage journal;
	private Pirates fernando = new Pirates("Fernando", Couleur.BLEU, 5);
	private Pirates romuald = new Pirates("Romuald", Couleur.ROUGE, 5);
	private Plateau plateau = new Plateau();

	Des des = new Des();

	public Jeu(Affichage journal) {
		this.journal = journal;
	}

	private boolean fin() {
		return fernando.getVictoire() || romuald.getVictoire();

	}

	private boolean decedee() {
		return fernando.getDecedee() || romuald.getDecedee();

	}

	public void lancerJeu() {
		while (!(fin() || decedee())) {

			journal.attendreTour(fernando.getNom());
			if (!(fernando.getFilet())) {
				fernando.deplacement(); // ← déplacer D'ABORD
				if (!(romuald.getBouclier())) {
					plateau.appliquerEffet(fernando, romuald);
				} else {
					romuald.setBouclier(false);
				}
			} else {
				fernando.setFilet(false);
			}

			journal.afficherDes(fernando.getValeur()); // ← puis afficher
			journal.afficherPosition(fernando.getPosition());
			journal.afficherArme(plateau.getcases(fernando.getPosition()));

			journal.afficherPv(fernando.getPv());
			journal.afficherBouclier(fernando.getBouclier());
			journal.afficherVictoire(fernando.getVictoire());

			if (!(fin() || decedee())) {
				journal.attendreTour(romuald.getNom());
				if (!(romuald.getFilet())) {
					romuald.deplacement(); // ← déplacer D'ABORD
					if (!(fernando.getBouclier())) {
						plateau.appliquerEffet(romuald, fernando);
					} else {
						fernando.setBouclier(false);
					}

				} else {
					romuald.setFilet(false);
				}

				journal.afficherDes(romuald.getValeur()); // ← romuald, pas fernando
				journal.afficherPosition(romuald.getPosition());
				journal.afficherArme(plateau.getcases(romuald.getPosition()));

				journal.afficherPv(romuald.getPv());
				journal.afficherBouclier(romuald.getBouclier());
				journal.afficherVictoire(romuald.getVictoire());
			}
		}

	}

}
