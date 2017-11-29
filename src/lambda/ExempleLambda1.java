package lambda;

import java.util.function.IntPredicate;

public class ExempleLambda1 {

	public static void main(String[] args) {
		int[] tab = {1, -4, 4, -3, 2, -8};
		
		affichage(tab, ee -> ee > 0);
	}
	
	private static void affichage(int[] tab, IntPredicate f) {
		for (int val: tab) {
			if (f.test(val)) {
				System.out.println(val);
			}
		}
	}

}
