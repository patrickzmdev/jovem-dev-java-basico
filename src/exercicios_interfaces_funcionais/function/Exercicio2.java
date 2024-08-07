package exercicios_interfaces_funcionais.function;


public class Exercicio2 {

	public static void main(String[] args) {

		QuadradoDoisElementos quadradoFunction = (a, b) -> (a * a) + (b * b);
		System.out.println(quadradoFunction.operar(10, 5));

	}

	@FunctionalInterface
	interface QuadradoDoisElementos {
		int operar(int a, int b);
	}

}
