package aula7.testes.exercicio1;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import aula5.stream.Exercicio5;

class Exercicio1Test {

	private List<Pessoa> nomes;
	
	
	
	@DisplayName("Testando o comportamento de uma lista vazia")
	@Test
	void retornaValorListaVazia() {
		
		String retorno = Exercicio1.buscaVogal(nomes);
	}
	
	@DisplayName("Testando o comportamento de uma lista com elementos")
	@Test
	void retornaValorListaComElementos() {
		
		nomes.add(new Pessoa("Ana", "48 9999-1111", LocalDate.of(1998, 5, 1)));
		String retorno = Exercicio1.buscaVogal(nomes);
		
	
	}
	

	

}
