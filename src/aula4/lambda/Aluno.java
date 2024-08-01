package aula4.lambda;

import java.util.Date;

public class Aluno {
	
	int numeroChamada;
	String nome;
	Date dataNascimento;
	@Override
	public String toString() {
		return "Aluno numeroChamada=" + numeroChamada + ", nome=" + nome + ", dataNascimento=" + dataNascimento;
	}
	public int getNumeroChamada() {
		return numeroChamada;
	}
	public void setNumeroChamada(int numeroChamada) {
		this.numeroChamada = numeroChamada;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	
	
	

}
