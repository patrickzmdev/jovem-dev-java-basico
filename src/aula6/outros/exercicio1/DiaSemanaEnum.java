package aula6.outros.exercicio1;

import java.util.function.Function;

public enum DiaSemanaEnum {

	SEGUNDA_FEIRA("Segunda-Feira"), TERCA_FEIRA("Terca-Feira"), QUARTA_FEIRA("Quarta-Feira"),
	QUINTA_FEIRA("Quinta-Feira"), SEXTA_FEIRA("Sexta-Feira"), SABADO("Sabado"), DOMINGO("Domingo");

	private String nome;

	private DiaSemanaEnum(String nome) {
		this.nome = nome;

	}

	public String getNome() {
		return nome;
	}

}
