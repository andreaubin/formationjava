package demo1;

public class MaClasse {
	
	private String nom;
	
	// constructeur par défaut
	MaClasse() { }
	
	// contructeur plus complexe
	MaClasse(String nom) {
		this.nom = nom;
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void afficherNom() {
		System.out.println(nom);
	}
}

