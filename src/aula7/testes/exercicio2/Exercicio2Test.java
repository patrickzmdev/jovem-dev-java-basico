package aula7.testes.exercicio2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class Exercicio2Test {


	
	@DisplayName("testando o comportamento de uma lista vazia")
	@Test
	
	public void retornaValorListaVaziaSemBertosException() {
		List<String> listaVazia = new ArrayList<>();
		 ZeroBertoException exception = assertThrows(ZeroBertoException.class, () -> {
	            Exercicio2.buscaPrimeiroNomeTerminadoEmBerto(listaVazia);
	        });
		 
		 assertEquals("Nenhum berto encontrado", exception.getMessage());
		
		
	}
	
	@DisplayName("testando o comportamento de uma lista com um berto")
	@Test
	
	public void retornaValorListaComUmBerto() throws ZeroBertoException {
		List<String> lista = new ArrayList<>();
		lista.add("Alberto");
		String resultado = Exercicio2.buscaPrimeiroNomeTerminadoEmBerto(lista);
		String resultadoEsperado = "Alberto";
		assertEquals(resultadoEsperado, resultado);
	}
	
	@DisplayName("testando o comportamento de uma lista com 2 bertos")
	@Test
	
	public void retornaValorListaComDoisBertos() throws ZeroBertoException {
		List<String> lista = new ArrayList<>();
		lista.add("Alberto");
		lista.add("Gilberto");
		String resultado = Exercicio2.buscaPrimeiroNomeTerminadoEmBerto(lista);
		String resultadoEsperado = "Alberto";
		assertEquals(resultadoEsperado, resultado);
	}
	
	
	
	

}
