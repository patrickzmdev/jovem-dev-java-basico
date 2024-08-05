package aula5.stream;

import java.time.LocalDate;

public class Pessoa {
	
	String nome;
	String telefone;
	LocalDate dataNasc;
	
	public Pessoa(String nome, String telefone, LocalDate dataNasc) {
		
		this.nome = nome;
		this.telefone = telefone;
		this.dataNasc = dataNasc;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", telefone=" + telefone + ", dataNasc=" + dataNasc + "]";
	}

	public LocalDate getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(LocalDate dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	

}
