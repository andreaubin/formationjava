package gestionbibliotheque.model;

public class Roman extends Livre {
	
	private String categorie;
	
	public Roman() {
		super();
	}
	
	public Roman(String numeroIsbn, String titre, String auteur, String categorie) {
		super(numeroIsbn, titre, auteur);
		this.categorie = categorie;
	}

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

}
