package aula7.testes.exercicio1;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import aula5.stream.Exercicio5;

class Exercicio1Test {

	
	
	
	
	@DisplayName("Testando o comportamento de uma lista vazia")
	@Test
	public void retornaValorListaVazia() {
		
		List<Pessoa> listaVazia = new ArrayList<Pessoa>();
		String resultado = Exercicio1.buscaVogal(listaVazia);
		assertEquals("", resultado);
	}
	
	@DisplayName("Testando o comportamento de uma lista com elementos")
	@Test
	public void retornaValorListaComElementos() {
		
		List<Pessoa> lista = Exercicio1.gerarLista();
		String resultado = Exercicio1.buscaVogal(lista);
		String resultadoEsperado = "Igor; Gabriel; Eduardo; Carlos; Ana";
		assertEquals(resultadoEsperado, resultado);
		
	
	}
	

	

}
