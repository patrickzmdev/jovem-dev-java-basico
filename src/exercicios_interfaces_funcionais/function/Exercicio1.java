package exercicios_interfaces_funcionais.function;

import java.util.function.Function;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Function<Integer, String> parImpar = n -> (n % 2 == 0) ? "par" : "impar";
		System.out.println(parImpar.apply(4));
		System.out.println(parImpar.apply(3));
		System.out.println(parImpar.apply(6));
		System.out.println(parImpar.apply(7));
		System.out.println(parImpar.apply(9));

	}

}
