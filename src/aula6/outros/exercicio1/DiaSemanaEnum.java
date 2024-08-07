package aula6.outros.exercicio1;

public enum DiaSemanaEnum {

	SEGUNDA_FEIRA("Segunda-Feira",false), 
	TERCA_FEIRA("Terca-Feira",false), 
	QUARTA_FEIRA("Quarta-Feira",false),
	QUINTA_FEIRA("Quinta-Feira",false), 
	SEXTA_FEIRA("Sexta-Feira",false), 
	SABADO("Sabado",true), 
	DOMINGO("Domingo",true);

	private String nome;
	private boolean fimDeSemana;

	private DiaSemanaEnum(String nome, boolean fimDeSemana) {
		this.nome = nome;
		this.fimDeSemana = fimDeSemana;

	}
	
//	public abstract boolean isFimDeSemana() {
//		return fimDeSemana;
//	};
	
//	@Override
	public boolean isFimDeSemana() {
		return fimDeSemana;
	}

	public String getNome() {
		return nome;
	}


	
	

}
