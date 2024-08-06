package exemplos_utilizacao_lambda;

import java.util.Arrays;
import java.util.List;

public class ReducaoDados {

	public static void main(String[] args) {
		// Somar todos os números de uma lista.
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		int sum = numbers.stream()
		                 .reduce(0, Integer::sum);
		
		System.out.println(sum);


	}

}
