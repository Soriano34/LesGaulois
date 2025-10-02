package test_fonctionnel;
import java.util.Iterator;

import personnages.*;
import personnages.Gaulois;
import personnages.Romain;
public class TestGaulois {
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		Gaulois obelix = new Gaulois("Obélix", 16);
		asterix.parler("Bonjour Obélix.");
		obelix.parler("Bonjour Astérix. Ca te dirais d'aller chasser des sangliers ?");
		asterix.parler("Oui très bonne idée.");
		Romain minus=new Romain(6, "Minus");
		System.out.println("Dans la forêt "+asterix+" et "+ obelix+" tombent nez à nez sur le romain "+ minus +".");
		for (int i = 0; i < 3; i++) {
		asterix.frapper(minus);}
		Romain brutus=new Romain(14, "Brutus");
		Druide panoramix=new Druide("panoramix", 2);
		panoramix.fabriquerPotion(4, 3);
		panoramix.booster(obelix);
		panoramix.booster(asterix);
		for (int j = 0; j < 3; j++) {
			asterix.frapper(brutus);
		}
		}
	
	}
	

