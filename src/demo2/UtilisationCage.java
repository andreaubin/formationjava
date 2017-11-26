package demo2;

public class UtilisationCage {
	
	/**
	 * Utilisation du polymorphisme
	 * @param args
	 */
	public static void main(String[] args) {
		Animal chat1 = new Chat();
		chat1.setRace("Angora");
		
		Chat chat2 = new Chat();
		chat2.setRace("Chartreux");
		
		Cage cage = new Cage();
		
		cage.accueillir(chat1);
		cage.accueillir(chat2);
	}

}
