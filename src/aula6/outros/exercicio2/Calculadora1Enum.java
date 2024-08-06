package aula6.outros.exercicio2;

import java.util.function.Function;

public enum Calculadora1Enum {
	
	SOMA("Adição", vb -> vb + 2 ),
	SUBTRACAO("Subtração", vb -> vb + 2) ,
	DIVISAO("Divisão", vb -> vb + 2),
	MULTIPLICACAO("Multiplicação", vb -> vb + 2);
	
	private String nomeAmigavel;
	private Function<Integer, Integer> calcula;
	
	private Calculadora1Enum(String nomeAmigavel, Function<Integer, Integer> calcula) {
		this.nomeAmigavel = nomeAmigavel;
		this.calcula = calcula;
	}
	
	

	public Function<Integer, Integer> getCalcula() {
		
		return calcula;
	}

	
	
	
	
	
	
	
	
	

}
