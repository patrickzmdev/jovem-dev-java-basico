package aula7.testes.exercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import aula5.stream.exceptions.ZeroBertoException;

public class Exercicio2 {

	public static void main(String[] args) throws ZeroBertoException {

		List<String> nomes = new ArrayList<>();

		nomes.add("Joao");
		nomes.add("Alberto");
		nomes.add("Gilbero");
		nomes.add("Maria");
		nomes.add("Pedro");
		nomes.add("Luiz");
		nomes.add("Carlos");
		nomes.add("Paloma");
		nomes.add("Antonio");
		nomes.add("Joana");
		
		System.out.println(new Exercicio2().buscaPrimeiroNomeTerminadoEmBerto(nomes));
		
//		try {
//		System.out.println(nomes.stream().filter(elemento -> elemento.endsWith("berto")).map(String::toUpperCase)
//				.findFirst().orElseThrow(ZeroBertoException::new));
//		}
//		catch(ZeroBertoException e) {
//			System.out.println(e.getMessage());
//		}
		
	}
	
	public String buscaPrimeiroNomeTerminadoEmBerto(List<String> lista) throws ZeroBertoException {
		return lista.stream()
				.filter(Objects::nonNull)
				.filter(n -> n.endsWith("berto"))
				.findFirst()
				.orElseThrow(() -> new ZeroBertoException("Nenhum berto encontrado"));
		
	}

}
