package aula2.poo.exercicio6;

import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {
		PessoaFisica p = new PessoaFisica();
		p.nome = "Joao";
		p.dataNasc = LocalDate.of(1992, 1, 15);
		p.cpf = "882312143-05";
		
		Pessoa p2 = new Pessoa();
		p2.nome = "Maria";
		p2.dataNasc = LocalDate.of(1993, 1, 15);
		
		if (p.dataNasc.equals(p2.dataNasc)) {
			System.out.println("Nasceram no mesmo dia");
		} else if (p.dataNasc.isAfter(p2.dataNasc)) {
			System.out.println(p2.nome + " é mais velho");
		} else {
			System.out.println(p.nome + " é mais velho");
		}
		
		

	}

}
