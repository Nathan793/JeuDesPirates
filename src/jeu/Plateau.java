package jeu;

public class Plateau {
	
private Case[] cases = new Case[30] ; 

public Plateau() {
	for (int i=0; i<30;i++ ) {
		cases[i]=new Case(i, null);
	}
	cases[14]= new CaseArme(14, ARMES.FUSIL);
	cases[10]= new CaseArme(10, ARMES.EPEE);
	cases[12]= new CaseArme(12, ARMES.EPEE);
	
	cases[13]= new CaseArme(13, ARMES.FUSIL);
	cases[16]= new CaseArme(16, ARMES.EPEE);
	cases[22]= new CaseArme(22, ARMES.EPEE);
	
	cases[3]= new CaseArme(3, ARMES.FUSIL);
	cases[6]= new CaseArme(6, ARMES.EPEE);
	cases[14]= new CaseArme(14,ARMES.CANON);
	
	cases[8]= new caseFilet(8,"fillet");
	cases[24]= new caseFilet(24,"fillet");
	
	cases[11]= new CaseBouclier(11,"Bouclier");
	cases[17]= new CaseBouclier(17,"Bouclier");
	cases[23]= new CaseBouclier(23,"Bouclier");
	cases[4]= new CaseBouclier(4,"Bouclier");
	cases[5]= new CaseBouclier(5,"Bouclier");
	
	
}

public void appliquerEffet(Pirates pirateActif, Pirates pirateAdverse) {
    Case c = cases[pirateActif.getPosition()];
    c.aplliquerEffet(pirateActif, pirateAdverse);
}
public Case getcases(int i) {
    return cases[i];
}
}




