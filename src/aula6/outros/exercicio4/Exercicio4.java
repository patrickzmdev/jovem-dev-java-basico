package aula6.outros.exercicio4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

public class Exercicio4 {

	public static void main(String[] args) {
		
		

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		Pessoa[] pessoas = new Pessoa[2];
		
		for(int i = 0; i < pessoas.length; i++) {
			pessoas[i] = new Pessoa();
			pessoas[i].nome = JOptionPane.showInputDialog("Digite o nome: ");
			pessoas[i].telefone = JOptionPane.showInputDialog("Digite o telefone: ");
			String data = JOptionPane.showInputDialog("Insira a sua data de nascimento:dd/mm/aaaa");
			pessoas[i].dataNasc = LocalDate.parse(data,formatter);
			
			
		}
		
		Pessoa pessoaMaisVelha = new Pessoa();
		pessoaMaisVelha.dataNasc = LocalDate.now();
		for(int i = 0; i<pessoas.length; i++) {
			if( pessoas[i].dataNasc.isBefore(pessoaMaisVelha.dataNasc)) {
				pessoaMaisVelha = pessoas[i];
			}
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append("o nome da pessoa é ");
		sb.append(pessoaMaisVelha.nome);
		sb.append(" seu telefone é ");
		sb.append(pessoaMaisVelha.telefone);
		sb.append(" sua data de dascimento é ");
		sb.append(pessoaMaisVelha.dataNasc.format(formatter));
		
		
		System.out.println(sb.toString());

	}

}
