package aula4.lambda;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {
		
		List<Aluno> aluno = new ArrayList<>();
		
		
		
		for ( int i = 1; i < 6; i++) {
			Aluno a = new Aluno();
			a.nome = JOptionPane.showInputDialog("Digite o nome do " +(i)+ " aluno");
			a.numeroChamada =Integer.parseInt(JOptionPane.showInputDialog("Digite o numero do " +(i)+ " aluno"));
			a.dataNascimento =Date.valueOf(JOptionPane.showInputDialog("Digite a data de nascimento: (yyyy-mm-dd)"));
			aluno.add(a);
		}
		
		aluno.sort(Comparator.comparing(Aluno::getDataNascimento));
		
		aluno.forEach((Aluno) -> {
			System.out.println(Aluno);
		});
		
		
		
		 
	
	}

}
