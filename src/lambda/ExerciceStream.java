package lambda;

class Contact {
	
	private String nom;
	private String prenom;
	private int anneeNaissance;
	
	public Contact(String nom, String prenom, int anneeNaissance){
		this.nom = nom;
		this.prenom = prenom;
		this.anneeNaissance = anneeNaissance;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAnneeNaissance() {
		return anneeNaissance;
	}

	public void setAnneeNaissance(int anneeNaissance) {
		this.anneeNaissance = anneeNaissance;
	}
	
}

public class ExerciceStream {
	
	Contact[] contact = {
			new Contact("Montagne", "José", 1985),
			new Contact("Galant", "Thibaut", 1990),
			new Contact("Dupont", "Thomas", 1995),
			new Contact("Roger", "Fabrice", 2000),
			new Contact("Dupont", "Nathalie", 1995)
	};
	
	public static void main(String[] args) {
		// afficher le nom des personne nées après 1992
		
		// afficher nombre de personnes nées avant 2000
		
		// Les afficher (prénom + nom) dans l'ordre alphabétique sur leur nom
	}
}
