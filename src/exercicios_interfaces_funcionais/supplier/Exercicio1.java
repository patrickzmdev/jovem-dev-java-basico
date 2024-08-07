package exercicios_interfaces_funcionais.supplier;

import java.util.function.Supplier;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Supplier<String> retorna = () -> "Testando supllier";
		System.out.println(retorna.get());

	}

}
