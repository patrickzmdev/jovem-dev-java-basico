package aula3.tratamentoerros;

import javax.swing.JOptionPane;

import aula3.tratamentoerros.exceptions.PrecoIncorretoException;
import aula3.tratamentoerros.exceptions.VendaException;

public class Desafio {
	public static void main(String[] args) {

		venda();

	}

	public static void venda() throws PrecoIncorretoException {
		Venda v = new Venda();
		int qntItens = 0;
		boolean valida = false;

		do {
			v.nomeCliente = JOptionPane.showInputDialog("Digite o nome do cliente: ");

			try {
				qntItens = Integer.parseInt(JOptionPane.showInputDialog("Quantos itens possui esse pedido:(1 a 10) "));
				if (qntItens <= 0 || qntItens > 10) {
					throw new VendaException();
				}
			} catch (VendaException e) {
				System.err.println(e.getMessage());
				JOptionPane.showMessageDialog(null, "Você digitou um valor inadequado. Encerrando programa......");
				break;

			} catch (NumberFormatException e) {
				System.err.println("Por favor insira um valor valido");
				continue;
			}

			for (int i = 0; i < qntItens; i++) {
				String nomeItem = JOptionPane.showInputDialog("Digite o nome do item " + (i + 1));
				double precoItem = 0;
				boolean precoValido = false;

				do {
					try {
						precoItem = Double
								.parseDouble(JOptionPane.showInputDialog("Digite o preço do item:" + (i + 1)));
						if (precoItem <= 0) {

							throw new PrecoIncorretoException();

						}
					} catch (PrecoIncorretoException e) {

						System.err.println(e.getMessage());
						continue;
					}

					catch (NumberFormatException e) {
						System.err.println("Por favor insira um valor valido");
						continue;
					}
					precoValido = true;
				} while (precoValido != true);
				v.addItem(new Item(nomeItem, precoItem));

			}
			valida = true;
		} while (valida != true);

		v.listaVenda();

	}

}
