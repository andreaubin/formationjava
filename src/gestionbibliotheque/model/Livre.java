package gestionbibliotheque.model;

import java.io.Serializable;

public abstract class Livre implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5940795265117717654L;

	private String numeroIsbn;
	
	private String titre;
	
	private String auteur;
	
	public Livre() {
		// constructeur vide
	}
	
	public Livre(String numeroIsbn, String titre, String auteur) {
		this.numeroIsbn = numeroIsbn;
		this.titre = titre;
		this.auteur = auteur;
	}

	public String getNumeroIsbn() {
		return numeroIsbn;
	}

	public void setNumeroIsbn(String numeroIsbn) {
		this.numeroIsbn = numeroIsbn;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	@Override
	public String toString() {
		return "Livre [numeroIsbn=" + numeroIsbn + ", titre=" + titre + ", auteur=" + auteur + "]";
	}

}
