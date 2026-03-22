package jeu;
import java.util.Scanner; // ← ajouter ceci
public class JournalPirate implements Affichage {
	
	@Override
	public void afficherDes(int valeur) {	
		System.out.println("La valeur du des "+valeur);
	}

	@Override
	public void afficherPosition(int position) {
		System.out.println("La position est "+position);
		
	}
	@Override
	public void afficherPv(int pv) {
		System.out.println("Nombre de pv  : "+pv);
		
	}
	
	
	
	@Override
	public void afficherArme(Case c) {
	    if (c instanceof CaseArme) {
	        CaseArme ca = (CaseArme) c;
	        System.out.println("⚔ Case arme : " + ca.getArme().getArme() 
	                         + " (" + ca.getArme().getDegat() + " dégâts)");
	    } else if (c instanceof caseFilet) {
	        System.out.println("🪤 Case filet : le pirate passe son prochain tour !");
	        
	        
	    } else if (c instanceof CaseBouclier) {
	    	System.out.println("🛡️Case bouclier ! Le pirate est protégé pour la prochaine attaque");
	    	
	    }
	    else {
	        System.out.println("Case normale");
	    }
	}

	@Override
	public void afficherFilet(Case c) {
	 
	}

	@Override
	public void afficherVictoire(Boolean victoire) {
		System.out.println("Victoire : "+victoire);
		
	}
	
	@Override
	public void afficherBouclier(Boolean bouclier) {
		System.out.println("Etat bouclier : "+bouclier);
		
	}

	@Override
	public void afficherNom(String nom) {
		System.out.println("Le nom du pirate "+nom);
		
	}

	@Override
	public void afficherCouleur(Couleur couleur) {
		System.out.println("La couleur est "+couleur );
		
	}
	
	
	
	private Scanner scanner = new Scanner(System.in);

	@Override
	public void attendreTour(String nom) {
	    System.out.println("\n--- Tour de " + nom + " --- Appuyez sur Entrée pour lancer le dé...");
	    scanner.nextLine();
	}
	
	
	
	
	

}
