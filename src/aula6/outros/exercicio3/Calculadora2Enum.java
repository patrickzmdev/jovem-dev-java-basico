package aula6.outros.exercicio3;

import java.util.function.BiFunction;

public enum Calculadora2Enum {

	SOMA("Adição"), SUBTRACAO("Subtração"), DIVISAO("Divisão"), MULTIPLICACAO("Multiplicação");
	
	private String nomeAmigavel;
	private BiFunction<Integer, Integer, Integer> calculo;
	
	private Calculadora2Enum(String nomeAmigavel, BiFunction<Integer, Integer, Integer> calculo) {
		this.nomeAmigavel = nomeAmigavel;
		this.calculo = calculo;
	}
	
	

}
