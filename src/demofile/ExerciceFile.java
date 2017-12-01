package demofile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExerciceFile {

	public static void main(String[] args) {
		// Copier le contenu du fichier test.txt dans un nouveau fichier

		// Utiliser FileInputStream et FileOutputStream
		File file = new File("D:/temp/test.txt");
		File fileOutput = new File("D/temp/result.txt");
		
		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			fis = new FileInputStream(file);
			fos = new FileOutputStream(fileOutput);

			int content;
			while ((content = fis.read()) != -1) {
				System.out.print((char) content);
				fos.write(content);
			}

			fos.flush();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fis != null)
					fis.close();
				if (fos != null) {
					fos.close();
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}

	}

}
