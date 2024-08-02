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
	
	public Date getDataNascimento() {
		return dataNascimento;
	}
	
	
	
	
	

}
