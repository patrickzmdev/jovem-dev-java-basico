package exemplos_utilizacao_lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UtilizacaoParalelismo {

	public static void main(String[] args) {
		// Processar uma lista de números em paralelo para calcular seus quadrados
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> squares = numbers.parallelStream()
		                               .map(n -> n * n)
		                               .collect(Collectors.toList());

		System.out.println(squares);

	}

}
