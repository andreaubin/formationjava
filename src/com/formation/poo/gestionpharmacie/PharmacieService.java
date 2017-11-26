package com.formation.poo.gestionpharmacie;

/**
 * Interface contenant les "signatures" des m�thodes � utiliser
 * 
 * Ces m�thodes doivent �tre impl�ment�es dans un service associ�
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
