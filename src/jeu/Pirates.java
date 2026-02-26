package jeu;

public class Pirates {
	private String nom;
	private Couleur couleur;
	private Des des = new Des();
	private int position = 0, cases = 30;
	private boolean flag ;
	private boolean victoire;
	private int valeur = 0;

	public Pirates(String nom, Couleur couleur) {
		this.nom = nom;
		this.couleur = couleur;

	}

	public int deplacement() {

		valeur = des.lancerDes();
		
		if ((position+valeur < cases) && (!victoire)) {
			//TODO Test
			System.out.println("***********position = " + position +", valeur :" + valeur + ", victoire ? " + victoire);
			position = position + valeur;
			victoire = false;
			flag = false ;
		} 
		else if ((position+valeur == cases) && (!victoire) ) {
			
			victoire = true;
			flag = false ;
			//TODO Test
			System.out.println("***********position ==cases " + position +", valeur :" + valeur + ", victoire ? " + victoire);

		} else if ((position+valeur > cases) && (!victoire)) {
			//TODO Test
			System.out.println("***********position>cases = " + position +", valeur :" + valeur + ", victoire ? " + victoire);
			position = cases-((position+valeur)-cases) ;
			victoire = false;
			flag = false ;
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
		System.out.println(" valeurdes :" + valeur );
		return valeur;
	
		
	}

	public String getNom() {
		return nom;
	}

}
