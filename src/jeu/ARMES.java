package jeu;

public enum ARMES {
	
	FUSIL("Fusil",3),EPEE("Epee",1),CANON("Canon",5);
	
	private int degat ;
	private String arme ;
	
	private ARMES(String arme,int degat) {
		this.arme=arme ;
		this.degat=degat ;
	}
	
public int getDegat() {
	return degat ;
}

public String getArme() {
	return arme ;
}

}
