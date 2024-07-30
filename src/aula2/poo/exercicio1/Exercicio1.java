package aula2.poo.exercicio1;


import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		
		
		String numero = JOptionPane.showInputDialog("Digite um numero com virgula:");
		String numeroPonto = numero.replace(",", ".");
		double numeroFinal = Double.parseDouble(numeroPonto);
		int numeroInteiro = (int)numeroFinal;
		System.out.println(numeroInteiro);

	}

}
