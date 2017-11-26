package demo2;

public class Animal implements Caracteristique {
	
	private String race;
	
//	public Animal() {
//		this.race = "Aucune pour le moment";
//	}

	@Override
	public void cri() {
		System.out.println("Je fais un cri impossible à reconnaitre");
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	@Override
	public String toString() {
		return "Animal [race=" + race + "]";
	}
	
	final void methodeAnimal() {
		System.out.println("Je suis une méthode propre à l'animal");
	}
	
	void methodePublique() {
		System.out.println("Je suis une méthode qui peut-être redéfinie");
	}
	
}
