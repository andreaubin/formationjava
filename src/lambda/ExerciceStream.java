package lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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

	@Override
	public String toString() {
		return "Contact [nom=" + nom + ", prenom=" + prenom + ", anneeNaissance=" + anneeNaissance + "]";
	}
	
}

public class ExerciceStream {
	
	public static void main(String[] args) {
		List<Contact> listContact = Arrays.asList(
				new Contact("Montagne", "José", 1985),
				new Contact("Galant", "Thibaut", 1990),
				new Contact("Dupont", "Thomas", 1995),
				new Contact("Roger", "Fabrice", 2000),
				new Contact("Dupont", "Nathalie", 1995)
		);
		
		// afficher le nom des personne nées après 1992
		listContact.stream()
			.filter(c -> c.getAnneeNaissance() > 1992)
			.forEach(x -> System.out.println(x));
		// afficher nombre de personnes nées avant 2000
		
		// Les afficher (prénom + nom) dans l'ordre alphabétique sur leur nom
		listContact.stream().sorted(Comparator.comparing(Contact::getNom))
			.forEach(c -> {
			System.out.println(c);
		});
		
		// stocker dans une List<Contact> tous les Contact dont le nom est Dupont
		List<Contact> listFiltered = listContact.stream()
				.filter(c -> c.getNom().equals("Dupont"))
				.collect(Collectors.toList());
		
		// calcul moyenne
		Double moyenne = listContact.stream()
				.mapToInt(Contact::getAnneeNaissance)
				.average()
				.getAsDouble();
		System.out.println(moyenne);
		
		// trouver un élément dans la liste
		
		// avant
		Contact contactAvant = null;
		for (Contact contact : listContact) {
			if (contact.getNom().equals("Roger")) {
				contactAvant = contact;
			}
		}
		
		// après
		Contact contact = listContact.stream()
		.filter(c -> c.getNom().equals("Roger"))
		.findFirst().orElse(null);
		
		if (contact != null) {
			System.out.println(contact);
		}
	}
	
}
