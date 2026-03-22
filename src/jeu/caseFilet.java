package jeu;

public class caseFilet extends Case{
	
		private boolean filet;
		public caseFilet(int numero, String effet) {
			super(numero,"effet");
			this.effet=effet ;
			
			
			
		}
			
			
		
		
	
		
		@Override
		public void aplliquerEffet(Pirates pirate1, Pirates pirate2) {
		    if (pirate1.getPosition() == numero) {
		        pirate1.setFilet(true); 
		    }
		}
		
		
		public boolean getfilet() {
			return filet ;
		}
	}

