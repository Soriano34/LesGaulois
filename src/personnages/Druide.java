package personnages;

import objets.Chaudron;

public class Druide {
	private String nom;
	private int force;
	private Chaudron chaudron;
	public Druide(String nom, int force) {
		this.nom = nom;
		this.force = force;
		this.chaudron=new Chaudron();
	}

	private String prendreParole() {
		return "Le Druide " + nom + " : ";
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");

	}

	public String getNom() {
		return nom;
	}

	public int getForce() {
		return force;
	}

	public void booster(Gaulois gaulois) {
		if (chaudron.resterPotion()) {
			
			if (gaulois.getNom()=="Obélix") {
				parler("Non, "+gaulois.getNom()+" Non !... Et tu le sais très bien !");
			}else {
				int forcedelapotion=chaudron.prendreLouche();
				gaulois.boirePotion(forcedelapotion);
				parler("Tiens "+ gaulois.getNom()+" un peu de potion magique.");
			}
			
		}else {parler("Désolé "+gaulois.getNom()+" il n'y a plus une seule goutte de potion.");}
	}

	public void fabriquerPotion(int quantite, int forcePotion) {
		chaudron.remplirChaudron(quantite,forcePotion);
		parler("J'ai concocté "+ quantite+" doses de potion magique. Elle a une force de  "+forcePotion+ ".");
		
	}
	
}
