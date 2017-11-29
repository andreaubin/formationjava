package gestionbibliotheque.model;

public class Bd extends Livre {
	
	private String dessinateur;
	
	public Bd() {
		super();
	}
	
	public Bd(String numeroIsbn, String titre, String auteur, String dessinateur) {
		super(numeroIsbn, titre, auteur);
		this.dessinateur = dessinateur;
	}

	public String getDessinateur() {
		return dessinateur;
	}

	public void setDessinateur(String dessinateur) {
		this.dessinateur = dessinateur;
	}
	
}
