package aula2.poo.exercicio2;

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {
		
		String frase1 = JOptionPane.showInputDialog("Digite uma frase: ").toLowerCase();
		String frase2 = JOptionPane.showInputDialog("Digite uma segunda frase: ").toLowerCase();
		
		if(frase1.equals(frase2)) {
			JOptionPane.showMessageDialog(null, "As frases são iguais");
			JOptionPane.showMessageDialog(null, "As frases possuem: " + frase1.length() + " caracteres.");
		}
		else {
			JOptionPane.showMessageDialog(null, "A primeira frase possui: " + frase1.length() + " caracteres.");
			JOptionPane.showMessageDialog(null, "A segunda frase possui: " + frase2.length() + " caracteres.");
		}
		
		

		
	}

}
