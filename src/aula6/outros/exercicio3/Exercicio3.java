package aula6.outros.exercicio3;

public class Exercicio3 {

	public static void main(String[] args) {
		
		int n1 = 2;
		int n2 = 2;
		
		int res = Calculadora2Enum.SOMA.getCalculo().apply(n1, n2);
		System.out.println(res);

		res = Calculadora2Enum.SUBTRACAO.getCalculo().apply(n1, n2);
		System.out.println(res);

		res = Calculadora2Enum.MULTIPLICACAO.getCalculo().apply(n1, n2);
		System.out.println(res);

		res = Calculadora2Enum.DIVISAO.getCalculo().apply(n1, n2);
		System.out.println(res);

	}

}
