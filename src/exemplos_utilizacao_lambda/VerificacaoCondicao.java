package exemplos_utilizacao_lambda;

import java.util.Arrays;
import java.util.List;

public class VerificacaoCondicao {

	public static void main(String[] args) {
		// Verificar se todos os números são positivos.
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		boolean allPositive = numbers.stream()
		                             .allMatch(n -> n > 0);


		System.out.println(allPositive);
	}

}
