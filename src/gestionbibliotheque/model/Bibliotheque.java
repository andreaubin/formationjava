package gestionbibliotheque.model;

import java.util.ArrayList;
import java.util.List;

public class Bibliotheque {
	
	private List<Livre> listLivre;
	
	public Bibliotheque() {
		this.listLivre = new ArrayList<>();
	}

	public List<Livre> getListLivre() {
		return listLivre;
	}

	public void setListLivre(List<Livre> listLivre) {
		this.listLivre = listLivre;
	}
	
}
