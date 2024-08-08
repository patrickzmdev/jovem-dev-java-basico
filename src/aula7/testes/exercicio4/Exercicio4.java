package aula7.testes.exercicio4;

public class Exercicio4 {

	public static void main(String[] args) {
		
		int n1 = 2;
		int n2 = 2;
		
		Exercicio4 ex = new Exercicio4();
		ex.somaCalc(n1, n2);
		ex.subCalc(n1, n2);
		ex.multCalc(n1, n2);
		ex.divCalc(n1, n2);

	}
	
	public Integer somaCalc(int valor1, int valor2) {
		return Calculadora2Enum.SOMA.getCalculo().apply(valor1, valor2);
		
	}
	
	public Integer subCalc(int valor1, int valor2) {
		return Calculadora2Enum.SUBTRACAO.getCalculo().apply(valor1, valor2);
		
	}
	
	public Integer multCalc(int valor1, int valor2) {
		return Calculadora2Enum.MULTIPLICACAO.getCalculo().apply(valor1, valor2);
		
	}
	
	public Integer divCalc(int valor1, int valor2) {
		return Calculadora2Enum.DIVISAO.getCalculo().apply(valor1, valor2);
		
	}

}
