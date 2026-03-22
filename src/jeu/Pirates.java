package jeu;

public class Pirates {
	private String nom;
	private Couleur couleur;
	private Des des = new Des();
	private int position = 0, cases = 30;
	
	
	private boolean victoire;
	private int valeur = 0;
	private int pv=5 ;
	private boolean filet ;
	private boolean bouclier;

	public Pirates(String nom, Couleur couleur, int pv) {
		this.nom = nom;
		this.couleur = couleur;
		this.pv=pv ;

	}
	

	public int deplacement() {
		//if (victoire) return position; 

		valeur = des.lancerDes();
		
		if ((position+valeur < cases) && (!victoire)) {
			//TODO Test
			System.out.println("Position ="+ position);
			position = position + valeur;
			victoire = false;
			
		} 
		else if ((position+valeur == cases) && (!victoire) ) {
			
			victoire = true;
			
			//TODO Test
			System.out.println("Position = "+ position);

		} else if ((position+valeur > cases) && (!victoire)) {
			//TODO Test
			System.out.println("Position = "+ position);
			position = cases-((position+valeur)-cases) ;
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
	public int getPv() {
		return pv;
	}
	
	public boolean getFilet() {
		return filet;
	}
	public boolean setFilet(boolean f) {
		filet= f ;
		return filet ;
	}
	public boolean getBouclier() {
		return bouclier;
	}
	public boolean setBouclier(boolean f) {
		bouclier= f ;
		return bouclier ;
	}
	
	
	public void setPv(int ouille) {
	    pv = Math.max(0, ouille); // ← ne jamais descendre sous 0
	}

	public boolean getDecedee() {
	    return pv <= 0; 
	}
	
	
	public int attaquer(Pirates pirate2, int degat) {
		pirate2.setPv(pirate2.getPv()-degat ) ; 
		return pirate2.getPv() ;
	}
	
	
	
	

}
