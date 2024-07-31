package aula3.tratamentoerros;

import javax.swing.JOptionPane;

import aula3.tratamentoerros.exceptions.ZeroException;

public class Exercicio2 {

	public static void main(String[] args) {
		
		double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero: "));
		double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero diferente de 0: "));
		
		System.out.println(numeros(num1,num2));


	}

	public static Double numeros(double num1, double num2) throws ZeroException {
		try {
			if(num2 == 0) {
				throw new ZeroException();
			}
			return num1/num2;
		}catch(IllegalArgumentException e) {
			System.err.println("Digite um valor valido");
			System.err.println(e.getMessage());
		}
		return num2;
		
		
	}

}
