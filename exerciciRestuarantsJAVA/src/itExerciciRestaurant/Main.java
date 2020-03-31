package itExerciciRestaurant;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Fase1
		int b5 = 0, b10 = 0, b20 = 0, b50 = 0, b100 = 0, b200 = 0, b500 = 0, price = 0;
		String menu [] = new String[5];
		int arrPrices [] = new int[5];
		int contP = 1;
		
		// Fase2
		for (int i = 0; i < menu.length; i++) {
			System.out.println("Introdueix el plat nº"+ contP);
			String m = sc.next();
			System.out.println("Introdueix el preu del plat nº"+ contP);
			int aP = sc.nextInt();
			
			menu[i] = m;
			arrPrices[i] = aP;
			contP++;
		}
		
		for (int i = 0; i < menu.length; i++) {
			System.out.println("el plat "+ i +" és " + menu[i]);
			System.out.println(" i el seu preu és de " + arrPrices[i]);
		}
		
		List <String> arrEat = new ArrayList <String>();
		int moreFood = 1;
		
		while (moreFood==1) {
			System.out.println("Què vols per menjar?");
			String eat = sc.next();
			
			arrEat.add(eat);
			
			System.out.println("Vol seguir demanant menjar? Escriu 1 si és que sí i 0 si és que no.");
			moreFood = sc.nextInt();
		}
		
		// Fase3
		String aE;
		String m;
		boolean isIn = true;
		
		for (int i = 0; i < arrEat.size(); i++) {
			aE = arrEat.get(i);
			for(int j = 0; j < menu.length; j++) {
				m = menu[j];
				if (aE.equals(m)) {
					isIn = true;
					price += arrPrices[j];
					break;
				} else {
					isIn = false;
				}
			}
			if (!isIn) {
				System.out.println(" el plat " + aE + " que ha demanat no existeix");
			}
		}
		System.out.println("La factura puja als : " + price + "€.-");
		do {
			if (price >= 500) {
				b500 += 1;
				price-=500;
			} else if (price >= 200 && price < 500) {
				b200 += 1;
				price-=200;
			} else if (price >= 100 && price < 200) {
				b100 += 1;
				price-=100;
			} else if (price >= 50 && price < 100) {
				b50 += 1;
				price-=50;
			} else if (price >= 20 && price < 50) {
				b20 += 1;
				price-=20;
			} else if (price >= 10 && price < 20) {
				b10 += 1;
				price-=10;
			} else if (price >= 5 && price < 10) {
				b5 += 1;
				price-=5;
			} 
		} while (price > 0);
		
		System.out.println("I l'haurà de pagar amb els següents bitllets : "	+ b500 + " billtet/s de 500€, "
																				+ b200 + " billtet/s de 200€, "
																				+ b100 + " billtet/s de 100€, "
																				+ b50 + " billtet/s de 50€, "
																				+ b20 + " billtet/s de 20€, "
																				+ b10 + " billtet/s de 10€, "
																				+ b5 + " billtet/s de 5€, ");
	}

}
