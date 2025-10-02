package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		System.out.println(asterix);

	}

	public Gaulois(String nom, int force) {
		this.force = force;
		this.nom = nom;

	}

	@Override
	public String toString() {
		return nom;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");

	}

	private String prendreParole() {
		return "Le Gaulois " + nom + " : ";
	}

	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		int force_coup = (force * effetPotion) / 3;
		if (effetPotion > 1) {
			effetPotion--;
		}
		romain.recevoirCoup(force_coup);
	}

	public void boirePotion(int forcePotion) {
		effetPotion = forcePotion;
		;
	}
}
