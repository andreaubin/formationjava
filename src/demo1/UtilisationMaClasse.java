package demo1;

public class UtilisationMaClasse {

	public static void main(String[] args) {
		MaClasse variable = new MaClasse();
		MaClasse variable2 = new MaClasse("Aubin");
		
		// 1er affichage
		System.out.println("1er affichage");
		variable.afficherNom();
		
		// 2eme affichage
		System.out.println("2eme affichage");
		variable2.afficherNom();
		
		// utilisation setter
		variable.setNom("Mon nom");
		// 3eme affichage
		System.out.println("3eme affichage");
		variable.afficherNom();
		
		// 4eme affichage
		System.out.println("4eme affichage via getter");
		System.out.println(variable2.getNom());
	}
	

}
