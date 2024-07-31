package aula3.tratamentoerros;

import javax.swing.JOptionPane;

import aula3.tratamentoerros.exceptions.VendaException;

public class Desafio {
	public static void main(String[] args) {
		
		
	}
	
	public static void venda() throws VendaException {
		Venda v = new Venda();
		
		v.nomeCliente = JOptionPane.showInputDialog("Digite o nome do cliente: ");
		
		try {
			
		}
		
	}

}
