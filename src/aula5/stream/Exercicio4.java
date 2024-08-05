package aula5.stream;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Exercicio4 {

	public static void main(String[] args) {

		Pessoa[] pessoasLista = { new Pessoa("Pedro", "9988121", LocalDate.parse("2020-04-03")),
				new Pessoa("Maria", "99777121", LocalDate.parse("2020-05-03")),
				new Pessoa("Marcio", "99121121", LocalDate.parse("2020-05-03")),
				new Pessoa("Mario", "656665121", LocalDate.parse("2020-04-03")),
				new Pessoa("Joao", "423423432121", LocalDate.parse("2020-04-03")),
				new Pessoa("Carlos", "3211231231", LocalDate.parse("2020-05-03")),
				new Pessoa("Antonio", "942388121", LocalDate.parse("2020-04-03")),
				new Pessoa("Felipe", "954388121", LocalDate.parse("2020-05-03")),
				new Pessoa("Larissa", "9423488121", LocalDate.parse("2020-04-03")),
				new Pessoa("Paloma", "9920188121", LocalDate.parse("2020-05-03")) 
				};
		
		List<Pessoa> pessoas = Arrays.asList(pessoasLista);
		
		pessoas.forEach(System.out::println);
		System.out.println("-------------------------------------Lista Maio-----------------------------------");
		
		Month mes = Month.MAY;
		
		List<Pessoa> nascidasMaio = pessoas.stream().filter(p -> p.getDataNasc().getMonth() == mes).sorted(Comparator.comparing(Pessoa::getNome)).collect(Collectors.toList());
		
		
		
		nascidasMaio.forEach(System.out::println);
		

	}

}
