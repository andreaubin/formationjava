package generic;
public class Triplet<X> {

	private X x, y, z; // les trois éléments du triplet

	public Triplet(X premier, X second, X troisieme) {
		x = premier;
		y = second;
		z = troisieme;
	}

	public X getPremier() {
		return x;
	}

	public X getSecond() {
		return y;
	}

	public X getTroisieme() {
		return z;
	}

	public void affiche() {
		System.out.println("premiere valeur : " + x + " - deuxieme valeur : " + y + " - troisieme valeur : " + z);
	}

}
