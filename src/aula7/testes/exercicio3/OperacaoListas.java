package aula7.testes.exercicio3;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class OperacaoListas {

	public static void main(String[] args) {

		OperacaoListas op = new OperacaoListas();

		op.somarValores(gerarConjunto());
		op.mediaValoresMaioresCinquenta(gerarConjunto());
		op.valoresIguaisVinteCinco(gerarConjunto());

	}

	public double somarValores(List<Integer> lista) {
		return lista.stream().mapToInt(Integer::intValue).sum();

	}

	public Double mediaValoresMaioresCinquenta(List<Integer> lista) {
		List<Integer> maiores50 = lista.stream().filter(p -> p > 50).collect(Collectors.toList());
		return maiores50.stream().mapToInt(Integer::intValue).average().orElse(0);
		

	}

	public Long valoresIguaisVinteCinco(List<Integer> lista) {
		return lista.stream().filter(p -> p == 25).count();

	}

	public static List<Integer> gerarConjunto() {
		return new Random().ints(50, 1, 100).boxed().collect(Collectors.toList());
	}

}
