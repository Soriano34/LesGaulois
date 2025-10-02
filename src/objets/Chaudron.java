package objets;

public class Chaudron {
	private int quantitePotion;
	private int forcePotion;


	public void remplirChaudron(int quantite, int forcePotion) {
		this.quantitePotion = quantite;
		this.forcePotion = forcePotion;
	}

	public boolean resterPotion() {
		return quantitePotion > 0;
	}

	public int prendreLouche() {
		int forceDeLaPotionLouche=forcePotion;
		quantitePotion -= 1;
		if (quantitePotion < 1) {
			forcePotion = 0; }
		return forceDeLaPotionLouche;
	}
}	
//En fait si y'a plus de potion on est obligé de mettre la forcepotion à 0 vu y'a plus pour ça on la sauvegarde avant

