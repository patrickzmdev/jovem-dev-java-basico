package aula7.testes.exercicio5;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Exercicio5Test {

	@DisplayName("testando o comportamento do calculo do raio")
	@Test
	public void retornaValorDoRaio() {
		Exercicio5 ex = new Exercicio5();
		BigDecimal resultado = ex.calcRaio(new BigDecimal(20));
		BigDecimal resultadoEsperado = BigDecimal.valueOf(3.1831);
		assertEquals(resultadoEsperado, resultado);
}

}
