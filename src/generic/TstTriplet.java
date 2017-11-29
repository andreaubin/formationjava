package generic;
public class TstTriplet {
	
	public static void main(String args[]) {
		Integer oi1 = 3; // équivalent à : Integer oi1 = new Integer (3) ;
		Integer oi2 = 5; // équivalent à : Integer oi2 = new Integer (5) ;
		Integer oi3 = 12; // équivalent à : Integer oi3 = new Integer (12) ;
		
		Triplet<Integer> ti = new Triplet<Integer>(oi1, oi2, oi3);
		// on aurait aussi pu écrire directement :
		// Triplet <Integer> ti = new Triplet<Integer> (3, 5, 12) ;
		ti.affiche();
		
		Triplet<Double> td = new Triplet<Double>(2.0, 12.0, 2.5);
		// on peut fournir des arguments de type double qui seront
		// convertis automatiquement en Double
		td.affiche();
		
		Triplet<String> ts = new Triplet<String>("titi", "tata", "toto");
		ts.affiche();
//		
//		Integer n = ti.getTroisieme();
//		System.out.println("troisieme element du triplet ti = " + n);
//		Double p = td.getPremier();
//		System.out.println("premier element du triplet td = " + p);
	}
}