package com.formation.poo.gestionpharmacie;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Classe Pharmacie : programme java permettant de g�rer une pharmacie
 * 
 * @author aaubin
 *
 */
public class Pharmacie {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String args[]) {
		
		// service � utiliser pour se servir des diff�rentes m�thodes
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

	// Les m�thodes utilitaires

	/**
	 * Affiche un menu dans la console
	 * @return
	 */
	static int afficherMenu() {
		int choix = 0;
		System.out.println();
		System.out.println();
		System.out.println("1 : Achat de m�dicament");
		System.out.println("2 : Approvisionnement en  m�dicaments");
		System.out.println("3 : Etats des stocks et des cr�dits");
		System.out.println("4 : Quitter");
		while ((choix != 1) && (choix != 2) && (choix != 3) && (choix != 4) && (choix != 5) && (choix != 6)) {
			choix = scanner.nextInt();
		}
		return choix; 
		
		// consigne :
		// 1 - Cr�er les classes Client et Medicament avec les bons attributs
		// Cr�er les m�thodes suivantes :
		// 2 - afficher(...) -> afficher les clients et leurs cr�dits + les m�dicaments et leurs stocks
		// 3 - approvisionner(..) -> permet d'approvisionner un m�dicament. On passe la liste en param�tre.
		// dans cette m�thode, il faudra appeler une m�thode trouverMedicament qui demandera � l'utilisateur de donner le nom du m�dicament
		// puis un nombre � ajouter au stock
		// 4 - acheter -> permet de faire acheter un m�dicament � un client
		// on passe la liste des clients et des m�dicaments en param�tre
		// r�utiliser la m�thode trouverMedicament pour retrouver le m�dicament et cr�er une m�thode trouverClient pour retrouver le bon client
		// Attention : lors d'un achat, on augmente le cr�dit du client et on diminue le stock
		// Attention 2 : le stock ne peut pas �tre n�gatif
		
		// Bonus 1 : cr�er les m�thodes pour cr�er un client et un m�dicament
		// Bonus 2 : Si vous voulez aller encore plus loin, faire des m�thodes pour modifier/supprimer un client/m�dicament
	}

}
