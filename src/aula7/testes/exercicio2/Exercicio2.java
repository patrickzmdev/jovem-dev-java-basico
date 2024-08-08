package aula7.testes.exercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Exercicio2 {

	public static void main(String[] args) throws ZeroBertoException {

		System.out.println(Exercicio2.buscaPrimeiroNomeTerminadoEmBerto(gerarlista()));

	}

	public static String buscaPrimeiroNomeTerminadoEmBerto(List<String> lista) throws ZeroBertoException {
		return lista.stream().filter(Objects::nonNull).filter(n -> n.endsWith("berto")).findFirst()
				.orElseThrow(() -> new ZeroBertoException("Nenhum berto encontrado"));

	}

	public static List<String> gerarlista() {
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
		return nomes;
	}

}
