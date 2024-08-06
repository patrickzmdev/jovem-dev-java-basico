package exemplos_utilizacao_lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapeamentoDados {

	public static void main(String[] args) {
		
		//: Transformar uma lista de números em seus quadrados.
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> squares = numbers.stream()
		                               .map(n -> n * n)
		                               .collect(Collectors.toList());
		
		System.out.println(squares);

	}

}
