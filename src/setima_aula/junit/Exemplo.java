package setima_aula.junit;

public class Exemplo {

		
		public String verificaNumero(int i) {				
			if (i == 0) {
				return "ZERO";
			}
			
			throw new IllegalArgumentException("Deve ser zero");

	}

}
