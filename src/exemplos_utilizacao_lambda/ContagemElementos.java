package exemplos_utilizacao_lambda;

import java.util.Arrays;
import java.util.List;

public class ContagemElementos {

	public static void main(String[] args) {
		// Contar quantos nomes têm mais de 3 letras
		
		List<String> names = Arrays.asList("Ana", "Pedro", "Elena", "Ivo");
		long count = names.stream()
		                  .filter(name -> name.length() > 3)
		                  .count();
		
		System.out.println(count);


	}

}
