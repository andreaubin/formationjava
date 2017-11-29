package com.formation.poo.gestionpharmacie;

import java.util.List;

/**
 * Interface contenant les "signatures" des méthodes à utiliser
 * 
 * Ces méthodes doivent être implémentées dans un service associé
 * 
 * @author aaubin
 *
 */
public interface PharmacieService {
	
	void acheter(List<Client> listClient, List<Medicament> listMedicament);
	
	void afficher(List<Client> listClient, List<Medicament> listMedicament);
	
	void approvisionner(List<Medicament> listMedicament);
	
	void augmenterCreditClient(Client client, double qte);
	
	void diminuerCreditClient(Client client);
	
	void augmenterStockMedicament(Medicament medicament, int quantite);
	
	void diminuerStockMedicament(Medicament medicament, int quantite);
	
	void creerClient(List<Client> listClient);
	
	void creerMedicament(List<Medicament> listMedicament);

}
