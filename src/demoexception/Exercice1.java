package demoexception;

import java.util.Scanner;

public class Exercice1 {

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Entrez la taille du tableau");
		Integer taille = scan.nextInt();

		Integer[] tableau;
		try {
			// Traitement des exceptions ici :
			if (taille < 0) {
				throw new PositiveException();
			} else {
				System.out.println("J'arrive à instancier mon tableau !");
				tableau = new Integer[taille];
			}
		} catch (PositiveException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Le programme continue");

	}

}
