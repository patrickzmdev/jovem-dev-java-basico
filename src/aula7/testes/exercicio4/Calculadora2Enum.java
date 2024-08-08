package aula7.testes.exercicio4;

import java.util.function.BiFunction;

public enum Calculadora2Enum {

	SOMA("Adição",(a,b) -> a + b), 
	SUBTRACAO("Subtração",(a,b) -> a - b), 
	DIVISAO("Divisão",(a,b) -> a / b), 
	MULTIPLICACAO("Multiplicação",(a,b) -> a * b);
	
	private String nomeAmigavel;
	private BiFunction<Integer, Integer, Integer> calculo;
	
	private Calculadora2Enum(String nomeAmigavel, BiFunction<Integer, Integer, Integer> calculo) {
		this.nomeAmigavel = nomeAmigavel;
		this.calculo = calculo;
	}
	
	public BiFunction<Integer, Integer, Integer> getCalculo() {
        return calculo;
    }
	
	public String getNomeAmigavel() {
        return nomeAmigavel;
    }

	

}
