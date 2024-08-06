package aula5.stream;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio {

	public static void main(String[] args) {

		Pessoa[] pessoasLista = { new Pessoa("Pedro", "9988121", LocalDate.parse("2020-04-03")),
				new Pessoa("Ana", "99777121", LocalDate.parse("2020-05-03")),
				new Pessoa("Marcio", "99121121", LocalDate.parse("2019-05-03")),
				new Pessoa("Elena", "656665121", LocalDate.parse("2018-04-03")),
				new Pessoa("Joao", "423423432121", LocalDate.parse("2017-04-03")),
				new Pessoa("Carlos", "3211231231", LocalDate.parse("2005-05-03")),
				new Pessoa("Antonio", "942388121", LocalDate.parse("2005-04-03")),
				new Pessoa("Felipe", "954388121", LocalDate.parse("2013-05-03")),
				new Pessoa("Larissa", "9423488121", LocalDate.parse("2020-04-03")),
				new Pessoa("Ursula", "9920188121", LocalDate.parse("2020-05-03")) };

		List<Pessoa> pessoas = Arrays.asList(pessoasLista);

		pessoas.forEach(System.out::println);

		List<Pessoa> nomes = pessoas.stream()
				.filter(p -> p.getNome().matches("[^AEIOU^]") || p.getDataNasc().isLeapYear())
				.sorted(Comparator.comparing(Pessoa::getNome).reversed()).collect(Collectors.toList());
		
		
		System.out.println("Resultado");
		System.out.println(nomes);

	}

}
