package exercicios_interfaces_funcionais.supplier;

import java.util.Random;
import java.util.function.Supplier;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Supplier<Integer>numRandom = () -> new Random().nextInt(10);
		System.out.println(numRandom.get());

	}

}
