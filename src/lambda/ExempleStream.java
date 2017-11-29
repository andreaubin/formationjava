package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ExempleStream {
	
	public static void main(String[] args) {
		// exemple de tri avec tableau de int
		int[] tab = {1, -4, 4, -3, 2, -8};		
		Long nbPositifs = IntStream.of(tab).filter(x -> x > 0).count();
		
		// exemple de tri avec une liste de Integer
		List<Integer> list = Arrays.asList(1, -4, 4, -3, 2, -8);
		Long nbPositifsList = list.stream().filter(x -> x > 0).count();
		
		System.out.println("nb positifs avec tableau" + nbPositifs);
		System.out.println("nb positifs avec liste" + nbPositifsList);
		
		// exemple avec filtre + tri + forEach
		list.stream().filter(x -> x > 0).sorted().forEach(val -> {
			System.out.println(val);
		});
		
		// effectuer des transformations sur les éléments
		int sum = IntStream.of(tab)
			.map(xx -> Math.abs(xx))
			.map(xx -> xx * xx)
			.sum();
		System.out.println(sum);
		
	}

}
