package exemplos_utilizacao_lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ColetaFormatoExpecifico {

	public static void main(String[] args) {
		// Juntar uma lista de nomes em uma única string separada por vírgulas
		
		List<String> names = Arrays.asList("Ana", "Pedro", "Elena", "Ivo");
		String joinedNames = names.stream()
		                          .collect(Collectors.joining(", "));
		
		System.out.println(joinedNames);


	}

}
