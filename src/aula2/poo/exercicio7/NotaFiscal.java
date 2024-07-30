package aula2.poo.exercicio7;

import javax.swing.JOptionPane;

public class NotaFiscal {
	String emitente;
	private double valor;
	
	
	public Double calculaValor() {
		double precoBruto = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço bruto do produto:"));
		double valDesc = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do desconto:"));
		valor = precoBruto - valDesc;
		return valor;
	}

}
