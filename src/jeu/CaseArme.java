package jeu;

public class CaseArme extends Case{
	private ARMES arme ;
	public CaseArme(int numero, ARMES arme) {
		super(numero,"arme");
		this.arme=arme ;
		
		
		
	}
	
	@Override 
public void aplliquerEffet(Pirates pirate1, Pirates pirate2 ) {
		if (pirate1.getPosition()== numero ) {
			pirate1.attaquer(pirate2,arme.getDegat());
			
		}
	
	}
	public ARMES getArme() {
		return arme ;
	}
}
