package programacaofuncional_lambda.funcao_como_parametro;

import java.util.ArrayList;
import java.util.List;

import programacaofuncional_lambda.Predicate.Product;

public class Program {

	public static void main(String[] args) {
	

		List<Product> list = new ArrayList<>();
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		ProductService ps = new ProductService();
		double sum = ps.filteredSun(list, p -> p.getPrice() < 100.0);
		System.out.println("Sum = " + String.format("%.2f", sum));
	}

}
