package programacaofuncional_lambda.Comparator.application;


import java.util.ArrayList;
import java.util.List;

import programacaofuncional_lambda.Comparator.entities.Product;



public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		
//		Comparator<Product> comp = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()); versao mais tradicional
//		list.sort(comp);
		list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase())); // versão mais enxuta
		

		for (Product p : list) {
			System.out.println(p);
		}
	}
}
