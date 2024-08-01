package aula3.tratamentoerros;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import aula3.tratamentoerros.exceptions.PrecoIncorretoException;
import aula3.tratamentoerros.exceptions.VendaException;

public class Venda {

	String nomeCliente;
	List<Item> itens = new ArrayList<>();

	public void addItem(Item item) {
		itens.add(item);
	}

	public void listaVenda() {
		System.out.println("Nome do cliente:" + nomeCliente);
		for (Item item : itens) {
			System.out.println(item);
		}
	}

	public void dadosVenda() throws VendaException {
		nomeCliente = JOptionPane.showInputDialog("Digite o nome do cliente: ");

		int qntItens = quantidadeItens();
		for (int i = 0; i < qntItens; i++) {
			String nomeItem = JOptionPane.showInputDialog("Digite o nome do item " + (i + 1));
			double precoItem = obterPrecoItem(i + 1);
			addItem(new Item(nomeItem, precoItem));
		}

	}

	private static int quantidadeItens() {
		int qntItens = 0;
		while (true) {
			try {
				qntItens = Integer.parseInt(JOptionPane.showInputDialog("Quantos itens possui esse pedido:(1 a 10) "));
				if (qntItens <= 0 || qntItens > 10) {
					throw new VendaException();
				}
				break;
			} catch (NumberFormatException e) {
				System.err.println("Por favor insira um valor válido");
			} catch (VendaException e) {
				System.err.println(e.getMessage());
				JOptionPane.showMessageDialog(null, "Erro na quantidade de itens. Encerrando programa...");
				System.exit(1);
			}
		}
		return qntItens;
	}

	private static double obterPrecoItem(int numeroItem) {
		double precoItem = 0;
		while (true) {
			try {
				precoItem = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do item " + numeroItem));
				if (precoItem <= 0) {
					throw new PrecoIncorretoException();
				}
				break;
			} catch (NumberFormatException e) {
				System.err.println("Por favor insira um valor válido");
			} catch (PrecoIncorretoException e) {
				System.err.println(e.getMessage());
			}
		}
		return precoItem;
	}

}
