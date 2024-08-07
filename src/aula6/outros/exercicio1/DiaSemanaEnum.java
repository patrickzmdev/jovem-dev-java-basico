package aula6.outros.exercicio1;

public enum DiaSemanaEnum {

	SEGUNDA_FEIRA("Segunda-Feira") {
		@Override
		public boolean isFimDeSemana() {
			return false;
		}
	}, TERCA_FEIRA("Terca-Feira") {
		@Override
		public boolean isFimDeSemana() {
			return false;
		}
	}, QUARTA_FEIRA("Quarta-Feira") {
		@Override
		public boolean isFimDeSemana() {
			return false;
		}
	},
	QUINTA_FEIRA("Quinta-Feira") {
		@Override
		public boolean isFimDeSemana() {
			return false;
		}
	}, SEXTA_FEIRA("Sexta-Feira") {
		@Override
		public boolean isFimDeSemana() {
			return false;
		}
	}, SABADO("Sabado") {
		@Override
		public boolean isFimDeSemana() {
			return true;
		}
	}, DOMINGO("Domingo") {
		@Override
		public boolean isFimDeSemana() {
			return true;
		}
	};

	private String nome;
	

	private DiaSemanaEnum(String nome) {
		this.nome = nome;
		

	}
	
	public abstract boolean isFimDeSemana();

	public String getNome() {
		return nome;
	}


	
	

}
