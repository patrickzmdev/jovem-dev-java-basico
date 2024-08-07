package aula6.outros.exercicio2;

import java.util.function.Function;

public enum Calculadora1Enum {
	
	SOMA("Adição", (a, b) -> a + b ),
	SUBTRACAO("Subtração", (a,b) -> a - b) ,
	DIVISAO("Divisão", vb -> 1 + 2),
	MULTIPLICACAO("Multiplicação", vb -> 1 + 2);
	
	private String nomeAmigavel;
	private Function<Integer, Integer> calcula;
	
	private Calculadora1Enum(String nomeAmigavel, Function<Integer, Integer> calcula) {
		this.nomeAmigavel = nomeAmigavel;
		this.calcula = calcula;
	}
	
	public Function<Integer, Integer> getCalcula(int a, int b) {
		
		return calcula;
	}
	


	
	
	
	
	
	
	
	
	

}
