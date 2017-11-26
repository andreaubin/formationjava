package com.formation.poo.gestionpharmacie;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Classe Pharmacie : programme java permettant de gérer une pharmacie
 * 
 * @author aaubin
 *
 */
public class Pharmacie {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String args[]) {
		
		// service à utiliser pour se servir des différentes méthodes
		final PharmacieServiceImpl pharmacieService = new PharmacieServiceImpl();
		
		final List<Client> listClient = new ArrayList<Client>();

		final List<Medicament> listMedicament = new ArrayList<>();

		// listClient.add(new Client("Dupont",0.0));
		// listClient.add(new Client("Pondu",0.0));

		// listMedicament.add(new Medicament("Doliprane", 5.40, 5));
		// listMedicament.add(new Medicament("Dafalgan",3.75, 5));

		int choix;

		do {
			choix = afficherMenu();

			switch (choix) {
			case 1:
				// acheter(listClient, listMedicament);
				break;
			case 2:
				// approvisionner(listMedicament);
				break;
			case 3:
				// afficher(listClient, listMedicament);
				break;
			case 4:
				// creerClient(client);
				break;
			case 5:
				// creerMedicament(medicament);
				break;
			case 6:
				// quitter();
			}
		} while (choix < 6);
	}

	// Les méthodes utilitaires

	/**
	 * Affiche un menu dans la console
	 * @return
	 */
	static int afficherMenu() {
		int choix = 0;
		System.out.println();
		System.out.println();
		System.out.println("1 : Achat de médicament");
		System.out.println("2 : Approvisionnement en  médicaments");
		System.out.println("3 : Etats des stocks et des crédits");
		System.out.println("4 : Quitter");
		while ((choix != 1) && (choix != 2) && (choix != 3) && (choix != 4) && (choix != 5) && (choix != 6)) {
			choix = scanner.nextInt();
		}
		return choix; 
		
		// consigne :
		// 1 - Créer les classes Client et Medicament avec les bons attributs
		// Créer les méthodes suivantes :
		// 2 - afficher(...) -> afficher les clients et leurs crédits + les médicaments et leurs stocks
		// 3 - approvisionner(..) -> permet d'approvisionner un médicament. On passe la liste en paramètre.
		// dans cette méthode, il faudra appeler une méthode trouverMedicament qui demandera à l'utilisateur de donner le nom du médicament
		// puis un nombre à ajouter au stock
		// 4 - acheter -> permet de faire acheter un médicament à un client
		// on passe la liste des clients et des médicaments en paramètre
		// réutiliser la méthode trouverMedicament pour retrouver le médicament et créer une méthode trouverClient pour retrouver le bon client
		// Attention : lors d'un achat, on augmente le crédit du client et on diminue le stock
		// Attention 2 : le stock ne peut pas être négatif
		
		// Bonus 1 : créer les méthodes pour créer un client et un médicament
		// Bonus 2 : Si vous voulez aller encore plus loin, faire des méthodes pour modifier/supprimer un client/médicament
	}

}
