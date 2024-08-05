package aula5.stream;

import java.time.LocalDateTime;
import java.util.Optional;

public class ExplicacaoOptional {
	public static void main(String[] args) throws IllegalAccessException {

		new ExplicacaoOptional();

	}

	public ExplicacaoOptional() throws IllegalAccessException {
		String s = getString();

		// optional substitui uma verificação de if e else fazendo o
		// mesmo processe em mneos linhas

		Optional<String> opt = Optional.ofNullable(s); // ofNullable evita erros caso acontece um valor nulo

		System.out.println(opt.orElse("Não encontrou")); // orElse= caso o valor seja nulo retorna o que foi passado
		System.out.println(opt.orElseGet(() -> "Não encontrou")); // orElseGet = necessita de um supllier para passar a
																	// string

		if (s != null) {
			System.out.println(s.toUpperCase());
		} else {
			System.out.println("Nao retornou");
		}

//		System.out.println(opt.orElse(getStringAlt())); // armazena o resultado dos 2 processos mostrando o que nao
//														// estiver nulo
//		
//		System.out.println(opt.orElseGet(() -> getStringAlt())); //só retorna o dado se for necessário

//		System.out.println(opt.orElseThrow(() -> new IllegalAccessException("Valor nulo"))); // retorna uma excessao que
//																								// agente cria
		
//		opt.ifPresent();// faz uma verificacao mais direta evitando erros
	}

	private String getStringAlt() {
		System.out.println("Chamou o metodo string alternativa");
		return "String alt";
	}

	private String getString() {
		// Optional
		if (LocalDateTime.now().getSecond() % 2 == 0) {
			return "Retornou";
		}
		return null;
	}

}
