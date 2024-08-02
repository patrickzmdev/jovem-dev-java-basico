package programacaofuncional_lambda.Predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Program {
	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		/*
		 * Function<Product, String> func = pd -> pd.getName().toUpperCase();
		 * 
		 * List<String> nomes = list.stream().map(func).collect(Collectors.toList());
		 * 
		 * nomes.forEach(System.out::println);            function. através do stream que torna o acesso ao map e possivel passar uma
		 * 													funcao anonima para uma lista, com o uso do stream tem que ser gerado uma 
		 * 													nova lista
		 */

//		list.removeIf(Product::nonStaticProductPredicate);
		double min = 100.0;

		Predicate<Product> pred = p -> p.getPrice() >= min;

		list.removeIf(pred);

		for (Product p : list) {
			System.out.println(p);
		}
		
		
	}

}
