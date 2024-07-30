package aula1.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JOptionPane;

public class Exercicio6 {

	public static void main(String[] args) {

		Map<String, List<Double>> aluno = new HashMap<>();
		for (int i = 1; i < 6; i++) {
			String nome = JOptionPane.showInputDialog("Insira o nome do aluno:");
			
			List<Double> notas = new ArrayList<Double>();
			for(int j = 1; j < 4; j++) {
				double n = Double.parseDouble(JOptionPane.showInputDialog("Digite a " + (j) + "°nota:"));
				notas.add(n);
			}
			
			
		aluno.put(nome, notas);
		double soma = 0;
		for (double nota: notas) {
			soma += nota;
		}
		double media = soma / notas.size();
		System.out.println("Nome:" + nome + ",notas: " + aluno.get(nome) + "media: " + media );
		}
	}

}
