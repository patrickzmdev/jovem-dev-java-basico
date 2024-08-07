package aula6.outros.exercicio2;

public enum Calculadora1Enum {

	
	SOMA("Adição", (a, b) -> a + b ),
	SUBTRACAO("Subtração", (a,b) -> a - b) ,
	DIVISAO("Divisão", vb -> 1 + 2),
	MULTIPLICACAO("Multiplicação", vb -> 1 + 2);
	


	SOMA("Adição", (a, b) -> a + b), SUBTRACAO("Subtração", (a, b) -> a - b), DIVISAO("Divisão", (a, b) -> a / b),
	MULTIPLICACAO("Multiplicação", (a, b) -> a * b);


	private String nomeAmigavel;
	private CalculoInterface calcula;

	private Calculadora1Enum(String nomeAmigavel, CalculoInterface calcula) {
		this.nomeAmigavel = nomeAmigavel;
		this.calcula = calcula;
	}

	
	public Function<Integer, Integer> getCalcula(int a, int b) {
		


	public interface CalculoInterface {
		int calcula(int a, int b);
	}

	public String getNomeAmigavel() {
		return nomeAmigavel;
	}

	public CalculoInterface getCalcula() {

		return calcula;
	}
	


}
