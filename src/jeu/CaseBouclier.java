package jeu;

public class CaseBouclier extends Case  {
		
			private boolean setBouclier;
			public CaseBouclier(int numero, String effet) {
				super(numero,"effet");
				this.effet=effet ;
				
				
				
			}
				
				
			
			
		
			
			@Override
			public void aplliquerEffet(Pirates pirate1, Pirates pirate2) {
			    if (pirate1.getPosition() == numero) {
			        pirate1.setBouclier(true); 
			    }
			}
			
			
			
		}



