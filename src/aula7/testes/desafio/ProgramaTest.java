package aula7.testes.desafio;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ProgramaTest {

	@BeforeEach
	public void setUp() {

		Programa.eventos = new HashMap<>();
		Programa.eventos.put("futuros", new ArrayList<>());
		Programa.eventos.put("passados", new ArrayList<>());

		Evento eventoFuturo = new Evento("Evento Futuro", LocalDateTime.now().plusDays(1), TipoEvento.LAZER);
		Evento eventoPassado = new Evento("Evento Passado", LocalDateTime.now().minusDays(1), TipoEvento.LAZER);

		Programa.eventos.get("futuros").add(eventoFuturo);
		Programa.eventos.get("passados").add(eventoPassado);
	}
	
	@DisplayName("testando o comportamento quando um usuario digita um evento invalido")
	@Test
	public void testeBuscaEventoInvalido() {
		Evento e = new Evento();
		assertThrows(NullPointerException.class, () -> e.buscaEvento(null));
	}

	
	
	@DisplayName("testando o comportamento quando um usuario digita um evento que não esta na lista")
	@Test
	public void testeBuscaEventoNaoEstaNaLista() {
		Evento e = new Evento();
		assertThrows(IllegalArgumentException.class, () -> e.buscaEvento("teste"));
	}

	@DisplayName("testando o comportamento de eventos da mesma categoria")
	@Test
	public void testeRetornoEventosMesmaCategoria() {
		String busca = "LAZER";
		Programa.buscaTipoEvento(busca);

		List<Evento> futuros = Programa.eventos.get("futuros");

		assertEquals(1, futuros.size());
		assertEquals("Evento Futuro", futuros.get(0).getDescricao());
		assertEquals(TipoEvento.LAZER, futuros.get(0).getTipoEvento());

	}
	
	@DisplayName("testando o comportamento de eventos de ambas categorias")
	@Test
	public void testeRetornoEventosAmbasCategorias() {
		String busca = "LAZER";
		Programa.buscaTipoEvento(busca);

		List<Evento> futuros = Programa.eventos.get("futuros");
		List<Evento> passados = Programa.eventos.get("passados");

		assertEquals(1, futuros.size());
		assertEquals("Evento Futuro", futuros.get(0).getDescricao());
		assertEquals(TipoEvento.LAZER, futuros.get(0).getTipoEvento());
		
		assertEquals(1, passados.size());
        assertEquals("Evento Passado", passados.get(0).getDescricao());
        assertEquals(TipoEvento.LAZER, passados.get(0).getTipoEvento());

	}
	
	
}
