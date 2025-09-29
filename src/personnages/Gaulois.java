package personnages;


public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion=1;
	public static void main(String[] args) {
		Gaulois asterix=new Gaulois("Astérix", 8);
		System.out.println(asterix);
		
	}
	public Gaulois(String nom, int force) {
		this.force=force;
		this.nom=nom;
		
	}
	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + "]";
	}
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
		
	}
	private String prendreParole() {
		return "Le Gaulois " +nom +" : ";
	}
	public void frapper(Romains romain) {
		String nom_romain = romain.getNom();
		System.out.println(nom+" envoie un grand coup dans la mâchoire de "+nom_romain);
		int force_coup=force/3;
		romain.recevoirCoup(force_coup);
	}
}


