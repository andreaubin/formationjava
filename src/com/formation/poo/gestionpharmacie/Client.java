package com.formation.poo.gestionpharmacie;

/**
 * Le client doit posséder un nom et un crédit
 * 
 * @author aaubin
 *
 */
public class Client {

	private String nom;
	private double solde;

	public Client(String nom, double solde) {
		this.nom = nom;
		this.solde = solde;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	@Override
	public String toString() {
		return "Client [nom=" + nom + ", solde=" + solde + "]";
	}

}
