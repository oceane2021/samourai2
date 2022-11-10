package personnages.principaux;

import personnages.Humain;

public class Commercant extends Humain {

	public Commercant(String nom, int argent) {
		super(nom, argent, "thé");	
	}
	
	public int seFaireExtorquer() {
		int monnaie = getArgent();
		this.perdreArgent(getArgent());  //il a perdu tout l'argent
		this.parler("le monde est vraiment trop injuste");
		return monnaie;
	}
	public void recevoir(int argent) {
		gagnerArgent(argent);
		parler ("merci");
	}
	
}
