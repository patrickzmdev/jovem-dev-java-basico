package exemplos_utilizacao_lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TransformacaoDados {

	public static void main(String[] args) {
		// Transformar uma lista de strings em uma lista de seus comprimentos
		
		List<String> names = Arrays.asList("Ana", "Pedro", "Elena", "Ivo");
		List<Integer> nameLengths = names.stream()
		                                 .map(String::length)
		                                 .collect(Collectors.toList());

		System.out.println(nameLengths);

	}

}
