package aula6.outros.exercicio2;

public class Exercicio2 {

	public static void main(String[] args) {
		

		int val1 = 2;
		int val2 = 2;
		
		int res = Calculadora1Enum.SOMA.getCalcula().calcula(val1, val2);
		System.out.println(res);
		
		res = Calculadora1Enum.SUBTRACAO.getCalcula().calcula(val1, val2);
		System.out.println(res);
		
		res = Calculadora1Enum.MULTIPLICACAO.getCalcula().calcula(val1, val2);
		System.out.println(res);
		
		res = Calculadora1Enum.DIVISAO.getCalcula().calcula(val1, val2);
		System.out.println(res);



	}

}
