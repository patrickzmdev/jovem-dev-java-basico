package aula7.testes.exercicio4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Exercicio4Test {

	@DisplayName("testando o comportamento da opção de soma da calculadora")
	@Test
	public void resultadoSomaValorCalculadora() {
		int n = 2;
		int n2 = 2;
		Exercicio4 ex = new Exercicio4();
		int resultado = ex.somaCalc(n, n2);
		int resultadoEsperado = 4;
		assertEquals(resultadoEsperado, resultado);
	}
	
	@DisplayName("testando o comportamento da opção de subtracao da calculadora")
	@Test
	public void resultadoSubtracaoValorCalculadora() {
		int n = 2;
		int n2 = 2;
		Exercicio4 ex = new Exercicio4();
		int resultado = ex.subCalc(n, n2);
		int resultadoEsperado = 0;
		assertEquals(resultadoEsperado, resultado);
	}
	
	@DisplayName("testando o comportamento da opção de multiplicação da calculadora")
	@Test
	public void resultadoMultiplicacaoValorCalculadora() {
		int n = 2;
		int n2 = 2;
		Exercicio4 ex = new Exercicio4();
		int resultado = ex.multCalc(n, n2);
		int resultadoEsperado = 4;
		assertEquals(resultadoEsperado, resultado);
	}
	
	@DisplayName("testando o comportamento da opção de divisão da calculadora")
	@Test
	public void resultadoDivisaoValorCalculadora() {
		int n = 2;
		int n2 = 2;
		Exercicio4 ex = new Exercicio4();
		int resultado = ex.divCalc(n, n2);
		int resultadoEsperado = 1;
		assertEquals(resultadoEsperado, resultado);
	}
	
	
	

}
