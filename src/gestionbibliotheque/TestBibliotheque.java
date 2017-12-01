package gestionbibliotheque;

import gestionbibliotheque.model.Bibliotheque;
import gestionbibliotheque.model.Roman;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestBibliotheque {

	public static void main(String[] args) {

		// instanciation de notre biblioth�que
		Bibliotheque bibliotheque = new Bibliotheque();
		
		bibliotheque.getListLivre().add(new Roman("1234","titre", "auteur", "categ"));
		
		ObjectOutputStream oos;
		try {
			oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File("test.txt"))));
			oos.writeObject(bibliotheque.getListLivre());
			oos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// Cr�er un Roman
		
		// Cr�er une BD

		// sauvegarder la bibliotheque dans un fichier
		// Regarder utilisation de FileOutputStream
		
		// charger la bibliotheque � partir d'un fichier
		// Regarder utilisation de FileInputStream
		
		// Astuces :
		// Pour cr�er des livres, vous pouvez utiliser ce que l'on a utilis� hier (le Scanner pour demander � l'utilisateur les infos)
		// Attention � bien g�rer les Exceptions
		
		// bonus non facultatif :
		// utiliser 2 Thread pour 

	}

}
