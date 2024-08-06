package exemplos_utilizacao_lambda;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FiltragemDados {

	public static void main(String[] args) {
		
		//Filtrar uma lista de nomes para encontrar aqueles que começam com uma vogal.
		
		List<String> names = Arrays.asList("Ana", "Pedro", "Elena", "Ivo", "Otavio", "Ursula");
		 Set<Character> vogais = new HashSet<>(Arrays.asList('A', 'E', 'I', 'O', 'U'));
		List<String> filteredNames = names.stream()
		                                  .filter(name -> vogais.contains(name.charAt(0))).collect(Collectors.toList());
		                         
		System.out.println(filteredNames);                                  

	}

}
