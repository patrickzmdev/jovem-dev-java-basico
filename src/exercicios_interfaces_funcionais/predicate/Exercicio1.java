package exercicios_interfaces_funcionais.predicate;

import java.util.function.Predicate;

public class Exercicio1 {

	public static void main(String[] args) {

		Predicate<Integer> positivo = n -> n >= 0;
		System.out.println(positivo.test(10));
		System.out.println(positivo.test(-10));

	}

}
