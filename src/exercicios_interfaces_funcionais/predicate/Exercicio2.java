package exercicios_interfaces_funcionais.predicate;

import java.util.function.Predicate;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Predicate<String> vazia = str -> str.isEmpty();
		System.out.println(vazia.test("Testando"));
		System.out.println(vazia.test(""));

	}

}
