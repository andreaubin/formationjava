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

		// instanciation de notre bibliothèque
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
		
		// Créer un Roman
		
		// Créer une BD

		// sauvegarder la bibliotheque dans un fichier
		// Regarder utilisation de FileOutputStream
		
		// charger la bibliotheque à partir d'un fichier
		// Regarder utilisation de FileInputStream
		
		// Astuces :
		// Pour créer des livres, vous pouvez utiliser ce que l'on a utilisé hier (le Scanner pour demander à l'utilisateur les infos)
		// Attention à bien gérer les Exceptions
		
		// bonus non facultatif :
		// utiliser 2 Thread pour 

	}

}
