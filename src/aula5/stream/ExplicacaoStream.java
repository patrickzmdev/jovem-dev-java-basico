package aula5.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class ExplicacaoStream {

	public static void main(String[] args) {

		List<String> lista = new ArrayList<String>();
		lista.add("adalberto");
		lista.add("antonio");
		lista.add("joao");
		lista.add(null);
		lista.add("claudio");
		lista.add("antonio");

//		lista.stream().map(String::toUpperCase).forEach(System.out::println); // String para String
//		lista.stream().map(String::length).forEach(System.out::println); // quantidade caracteres
//
//		lista.stream().filter(elemento -> elemento.startsWith("a")).forEach(System.out::println); // filtro letras
//																									// iniciais
//
//		lista.stream().filter(elemento -> elemento.startsWith("a")).map(String::toUpperCase)
//				.forEach(System.out::println); // filtro letras iniciais e depois coloca em letra maiscula
//		
//		lista.stream().filter(elemento -> elemento.startsWith("a")).distinct().map(String::toUpperCase) //filtra repetidos
//		.forEach(System.out::println);

//		lista.stream().filter(elemento -> elemento.startsWith("a")).peek(el -> System.out.println("teste1" + el)).sorted().peek(el -> System.out.println("teste2" + el)).map(String::toUpperCase) //sorted ordena
//		.forEach(System.out::println);
//		
		lista.stream().filter(elemento -> elemento.startsWith("a")).limit(2).map(String::toUpperCase) // limita
																										// resultados
				.forEach(System.out::println);

		// peek -é usado para saber como anda o processo

		System.out.println(
				lista.stream().filter(elemento -> elemento.startsWith("a")).mapToInt(String::length).average()); // Necessario
																													// maptoint
											
		System.out.println(
				lista.stream().filter(elemento -> elemento.startsWith("a")).mapToInt(String::length).average());																													// utilizar
																													// as
																													// funcionalidade
																													// numericas
		System.out.println(lista.stream().filter(Objects::nonNull).filter(elemento -> elemento.startsWith("a")).map(String::toUpperCase)
				.findFirst().orElse("Nao encontrado")); // conta resultados
		// se acontecer de a lista tiver um valor nulo é necessario utilizar filter(Objects::nonNull) para não dar erro
		

		List<String> nomeFiltrado = lista.stream().filter(elementos -> elementos.startsWith("a"))
				.collect(Collectors.toList());
		// filtra um resultado e joga para outra lista
		System.out.println(lista);
		System.out.println(nomeFiltrado);

		System.out.println(lista.stream().filter(elemento -> elemento.startsWith("a")).map(String::toUpperCase)
				.findFirst().orElse("Nao encontrado")); // conta resultados

		Set<String> nomeFiltradoSet = lista.stream().filter(elementos -> elementos.startsWith("a"))
				.collect(Collectors.toSet());
		// filtra um resultado e joga para outro hashset
		System.out.println(lista);
		System.out.println(nomeFiltradoSet);

		Map<Integer, String> nomeFiltradoMap = lista.stream().filter(elementos -> elementos.startsWith("a"))
				.collect(Collectors.toMap(String::length, s -> s));
		// filtra um resultado e joga para outro hashmap, se tiver algo repetido na
		// chave no caso o comprimento da string da erro
		System.out.println(lista);
		System.out.println(nomeFiltradoMap);

		Map<Integer, List<String>> nomeFiltradoMap2 = lista.stream() // filtra em posicoes diferentes dependendo da
																		// condicao
				.collect(Collectors.groupingBy(String::length));

		System.out.println(nomeFiltradoMap2);

		String nomeFiltradoMap3 = lista.stream().collect(Collectors.joining(", ")); // faz a iteração de um jeito mais
																					// facil que o for tradicional
		
		

		System.out.println(nomeFiltradoMap2);

	}

}
