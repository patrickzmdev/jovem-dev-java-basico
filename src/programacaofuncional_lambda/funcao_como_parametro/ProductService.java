package programacaofuncional_lambda.funcao_como_parametro;

import java.util.List;
import java.util.function.Predicate;

import programacaofuncional_lambda.Predicate.Product;

public class ProductService {
	
	public double filteredSun(List<Product> list, Predicate<Product> criterio) {
		double sum = 0.0;
		for( Product p : list) {
			if(criterio.test(p)) {
				sum += p.getPrice();
			}
		}
		return sum;
	}

}
