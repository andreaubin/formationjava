package demo2;

public class UtilisationAnimal {
	
	public static void main(String[] args) {
		Animal animal = new Animal();
		Aigle aigle = new Aigle();
		Chat chat = new Chat();
		
		// Les 3 peuvents crier, mais quelle méthode est appelée ?
		animal.cri();
		aigle.cri();
		chat.cri();
		
		// Utilisation du toString()
		System.out.println(animal);
		System.out.println(aigle);
		System.out.println(chat);
		
		// Je redéfinis mon chat
		System.out.println("Je définis mon chat");
		chat.setRace("Persan");
		chat.setAimePoisson(true);
		System.out.println(chat);
		
//		aigle.setAimePoisson(true);
		
		// Utilisation d'une méthode présente seulement dans une classe fille
		aigle.voler();
//		chat.voler();
		
	}

}
