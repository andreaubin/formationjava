package demoexception;

public class TestException {

	public static void main(String[] args) {
		// ETAPE 1 - Lance l'Exception ArithmeticException
		// System.out.println(4 / 0);

		// ETAPE 2 - Try catch
		// try {
		// System.out.println(4 / 0);
		// } catch(ArithmeticException e) {
		// System.out.println("Attention, tu as divisé par zéro !");
		// }
		//
		// System.out.println("Suite du programme");

		// ETAPE 3 - Null Pointer
		// String string = null;
		// string.toString();
		//
		// if (string != null) {
		// string.toString();
		// }

		// ETAPE 4 - Throw une exception
		// int i = -10;
		//
		// try {
		// if (i < 0) {
		// throw new Exception("Nombre négatif");
		// }
		// } catch (Exception e) {
		// System.out.println(e.getMessage());
		// }

		// ETAPE 5 - méthode qui throw une exception
		// try {
		// methode1();
		// } catch (Exception e) {
		// System.out.println(e.getMessage());
		// }
	}

	static void methode1() throws Exception {
		methode2();
	}

	static void methode2() throws Exception {
		throw new Exception("exception passé par les méthodes");
	}

}
