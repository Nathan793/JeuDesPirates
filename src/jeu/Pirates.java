package jeu;

public class Pirates {
	private String nom;
	private Couleur couleur;
	private Des des = new Des();
	private int position = 0, cases = 30;
	private boolean victoire;
	private int valeur = des.lancerDes();

	public Pirates(String nom, Couleur couleur) {
		this.nom = nom;
		this.couleur = couleur;

	}

	public int deplacement() {

		valeur = des.lancerDes();
		if (position < cases) {
			position = position + valeur;
			victoire = false;
		} else if (position == cases) {
			victoire = true;

		} else {
			position = position - cases;
			victoire = false;
		}
		return position;
	}

	public int getPosition() {
		return position;
	}

	public boolean getVictoire() {
		return victoire;
	}

	public int getValeur() {
		return valeur;
	}

	public String getNom() {
		return nom;
	}

}
