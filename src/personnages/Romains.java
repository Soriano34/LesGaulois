package personnages;

import java.io.ObjectInputStream.GetField;

public class Romains {
	
	private int force;
	private String nom;
	public Romains(int force, String nom) {
		this.force = force;
		this.nom = nom;
	}
	public String getNom() {
		return nom;
	}
	public void parler(String texte){
		
	System.out.println(prendreParole()+"\""+texte + "\"");
		
	}
	private String prendreParole() {
		return "Le romain "+nom + " : ";
	}
	
}
	