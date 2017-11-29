package com.formation.poo.gestionpharmacie;

import java.util.List;
import java.util.Scanner;

/**
 * Classe possédant des méthodes utiles pour intéragir sur un client ou sur un
 * médicament
 * 
 * @author aaubin
 *
 */
public class PharmacieServiceImpl implements PharmacieService {

	private static Scanner scanner = new Scanner(System.in);

	@Override
	public void acheter(List<Client> listClient, List<Medicament> listMedicament) {
		// trouver le client
		Client client = lireClient(listClient);
		Medicament medicament = lireMedicament(listMedicament);
		
		int quantite = lireQuantite();
		double paiement = lirePaiement();
	 
	    if (quantite <= medicament.getStock()) {
	    	diminuerStockMedicament(medicament, quantite);
	    	augmenterCreditClient(client, (medicament.getPrix() * quantite) - paiement);
	    } else
	      System.out.println("Achat Impossible. Quantité insuffisante");

	}
	
	@Override
	public void afficher(List<Client> listClient, List<Medicament> listMedicament) {
		System.out.println("Affichage des stocks");
		listMedicament.forEach(medicament -> {
			System.out.println("Stock du médicament " + medicament.getNom()
		             + " :" + medicament.getStock());
		});
	 
	    System.out.println("Affichage des crédits");
	    for (Client client: listClient) {
	    	System.out.println(client);
	    }
		
	}

	@Override
	public void augmenterCreditClient(Client client, double qte) {
		client.setSolde(client.getSolde() + qte);
	}
	
	@Override
	public void approvisionner(List<Medicament> listMedicament) {
		Medicament medicament = lireMedicament(listMedicament);
		
		System.out.println("Donner la Quantité : ");
	    int quantite = scanner.nextInt();
	    // se debarasser du \n 
	    scanner.nextLine();
	    augmenterStockMedicament(medicament, quantite);
		
	}

	@Override
	public void diminuerCreditClient(Client client) {
		// TODO Auto-generated method stub

	}

	@Override
	public void augmenterStockMedicament(Medicament medicament, int quantite) {
		medicament.setStock(medicament.getStock() + quantite);

	}

	@Override
	public void diminuerStockMedicament(Medicament medicament, int quantite) {
		medicament.setStock(medicament.getStock() - quantite);
	}
	
	@Override
	public void creerClient(List<Client> listClient) {
		System.out.println("Quel est le nom du client ? :");
		final String nom = scanner.nextLine();
		
		listClient.add(new Client(nom, 0.0d));
		
	}
	
	@Override
	public void creerMedicament(List<Medicament> listMedicament) {
		System.out.println("Quel est le nom du médicament ? :");
		final String nom = scanner.nextLine();
		
		System.out.println("Quel est le prix du médicament ? :");
		final double prix = scanner.nextDouble();
		
		System.out.println("Quel est le stock de départ ? :");
		final int stock = scanner.nextInt();
		
		Medicament medicament = new Medicament(nom, prix, stock);
		listMedicament.add(medicament);
	}
	
	static Client lireClient(List<Client> listClient) {
		Client c = null;

		System.out.println("Nom du client?:");

		do {
			final String nom = scanner.nextLine();

			c = listClient.stream()
					.filter(client -> client.getNom().equals(nom))
					.findFirst().orElse(null);

			if (c == null) {
				System.out.println("Client inconnu. Veuilliez recommencer");
			}
		} while (c == null);
		return c;
	}
	
	/**
	 * Retourne l'objet Medicament associé à un nom (String) Le nom est lu et
	 * redemandé tant qu'il ne correspond pas au nom d'un médicament contenu
	 * dans le tableau medicaments
	 */
	static Medicament lireMedicament(List<Medicament> listMedicament) {
		Medicament m = null;
		System.out.println("Nom du medicament?:");
		do {
			final String nom = scanner.nextLine();
			m = listMedicament.stream().filter(medic -> medic.getNom().equals(nom))
					.findFirst().orElse(null);

			if (m == null) {
				System.out.println("Medicament inconnu. Veuilliez recommencer");
			}
		} while (m == null);
		return m;
	}

	static double lirePaiement() {
		System.out.println("quel est le montant du paiement?");
		double paiement = scanner.nextDouble();
		scanner.nextLine();
		return paiement;
	}

	static int lireQuantite() {
		System.out.println("quelle est la quantité achetée?");
		int quantite = scanner.nextInt();
		scanner.nextLine();
		return quantite;

	}

}
