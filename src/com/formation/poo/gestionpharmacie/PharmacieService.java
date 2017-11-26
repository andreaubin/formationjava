package com.formation.poo.gestionpharmacie;

/**
 * Interface contenant les "signatures" des méthodes à utiliser
 * 
 * Ces méthodes doivent être implémentées dans un service associé
 * 
 * @author aaubin
 *
 */
public interface PharmacieService {
	
	public abstract void augmenterCreditClient(Client client);
	
	void diminuerCreditClient(Client client);
	
	void augmenterStockMedicament(Medicament medicament);
	
	void diminuerStockMedicament(Medicament medicament);

}
