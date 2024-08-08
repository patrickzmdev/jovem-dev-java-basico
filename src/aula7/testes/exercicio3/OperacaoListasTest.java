package aula7.testes.exercicio3;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class OperacaoListasTest {

	@DisplayName("testando o comportamento da soma de valores em uma lista")
	@Test
	public void retornaValoresSomadosLista() {
		List<Integer> lista = new ArrayList<>();
		OperacaoListas op = new OperacaoListas();
		lista.add(30);
		lista.add(20);
		lista.add(10);
		double resultado = op.somarValores(lista);
		double resultadoEsperado = 60.0;
		assertEquals(resultadoEsperado, resultado);

	}

	@DisplayName("testando o comportamento da media dos numeros maiores que 50")
	@Test
	public void retornaMediaNumerosMaioresQueCinquenta() {
		List<Integer> lista = new ArrayList<>();
		OperacaoListas op = new OperacaoListas();
		lista.add(60);
		lista.add(62);
		lista.add(10);
		double resultado = op.mediaValoresMaioresCinquenta(lista);
		double resultadoEsperado = 61;
		assertEquals(resultadoEsperado, resultado);
	}
	
	@DisplayName("testando o comportamento da soma de numeros 25")
	@Test
	public void retornaSomaNumerosVinteCinco() {
		List<Integer> lista = new ArrayList<>();
		OperacaoListas op = new OperacaoListas();
		lista.add(25);
		lista.add(62);
		lista.add(25);
		long resultado = op.valoresIguaisVinteCinco(lista);
		long resultadoEsperado = 2;
		assertEquals(resultadoEsperado, resultado);
	}
	
	
}
