package aula3.tratamentoerros;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {

		int valor = 0;
		boolean valida = false;
		do {
			try {
				valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro: "));
				valida = true;
			} catch (NumberFormatException e) {
				System.err.println("Você digitou um valor não reconhecido");
				
			} 
			

		} while (valida != true);

	}
}
