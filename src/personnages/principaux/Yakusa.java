package personnages.principaux;

import personnages.Humain;

public class Yakusa extends Humain {
	String clan;
	int reputation;

	public Yakusa(String nom, int argent,String clan) {
		super(nom,argent, clan); //on reprend les parametres de Humain car 
		this.reputation = 0;   // un Yakusa est un Humain
		this.clan = clan;
	}                                      
		
		public void extorquer (Commercant commercant) {
			this.gagnerArgent(commercant.seFaireExtorquer());
			this.reputation -=1;
			this.parler ("j'ai extorquer un commercant et j'ai perdu 1pt de reputation");
		}
		
		public int perdre () {
			int monnaie = getArgent();
			this.perdreArgent(getArgent());
			this.reputation -= 1;
			this.parler("J'ai perdu");
			return monnaie;
		}
		
			
		public void gagner () {
			this.reputation += 1;
			this.parler("J'AI GAGNE !!!!!!");
		}
	
}
