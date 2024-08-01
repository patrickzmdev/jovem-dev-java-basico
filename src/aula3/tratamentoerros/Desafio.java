package aula3.tratamentoerros;

import javax.swing.JOptionPane;

import aula3.tratamentoerros.exceptions.VendaException;

public class Desafio {
	public static void main(String[] args) {

		try {
			venda();

		} catch (VendaException e) {
			System.err.println(e.getMessage());
			JOptionPane.showMessageDialog(null, "Erro na venda. Encerrando programa...");
		}

	}

	public static void venda() throws VendaException {
		Venda v = new Venda();
		v.dadosVenda();
		v.listaVenda();
	}

}
