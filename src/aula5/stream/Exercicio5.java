package aula5.stream;

import java.util.ArrayList;
import java.util.List;

import aula5.stream.exceptions.ZeroBertoException;

public class Exercicio5 extends ZeroBertoException{

	public static void main(String[] args) {

		List<String> nomes = new ArrayList<>();

		nomes.add("Joao");
		nomes.add("Albeto");
		nomes.add("Gilbero");
		nomes.add("Maria");
		nomes.add("Pedro");
		nomes.add("Luiz");
		nomes.add("Carlos");
		nomes.add("Paloma");
		nomes.add("Antonio");
		nomes.add("Joana");
		
		System.out.println(nomes);
		
		try {
		System.out.println(nomes.stream().filter(elemento -> elemento.endsWith("berto")).map(String::toUpperCase)
				.findFirst().orElseThrow(ZeroBertoException::new));
		}
		catch(ZeroBertoException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
