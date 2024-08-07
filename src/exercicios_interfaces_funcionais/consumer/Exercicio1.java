package exercicios_interfaces_funcionais.consumer;

import java.util.function.Consumer;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Consumer<String> printer = mensagem -> System.out.println(mensagem);
		printer.accept("Testando");

	}

}
