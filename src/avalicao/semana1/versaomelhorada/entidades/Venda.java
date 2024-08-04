package avalicao.semana1.versaomelhorada.entidades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JOptionPane;

public class Venda {

	List<Produto> listaCompra = new ArrayList<>();

	public void buscaProduto(List<Produto> lista) {

		String nomeProduto = JOptionPane.showInputDialog("Digite o nome do produto que você deseja: ");
		for (Produto p : lista) {
			if (p.getNome().equalsIgnoreCase(nomeProduto)) {
				JOptionPane.showMessageDialog(null, "Produto: " + p);
				p.quantidade = Integer
						.parseInt(JOptionPane.showInputDialog("Quantas unidades você deseja do produto: "));
				listaCompra.add(p);
				return;
			}

		}
		JOptionPane.showMessageDialog(null, "Produto não encontrado.");
		System.out.println(listaCompra);
	}

	public void listCompra() {
		System.out.println("-------------------Lista de Compras---------------------");
		for (Produto produto : listaCompra) {
			System.out.println(produto);
		}
	}


	public double valorSubTotal() {
		double valorTotal = 0;
		for (Produto produto : listaCompra) {
			valorTotal += produto.getPreco() * produto.getQuantidade();

		}

		return valorTotal;
	}

	public String valorTotal(Double desc) {
		return String.format("%.2f", valorSubTotal() * desc + valorSubTotal());

	}

	public void imprimirCupom() {
		System.out.println();
		System.out.println();
		System.out.println("--------------------CUPOM--------------------");
		for (Produto produto : listaCompra) {
			System.out.println(produto.getNome());
			System.out.println(produto.getQuantidade() + "x " + produto.getPreco() + "  .........................  "
					+ String.format("%.2f", produto.getQuantidade() * produto.getPreco()));
			System.out.println();
		}
		System.out.println("SubTotal  ......................... " + String.format("%.2f", valorSubTotal()));

	}

	public String formaPagamento() {
		JOptionPane.showMessageDialog(null, "Escolha sua forma de pagamento: ");
		boolean valida = false;
		String formPgto = "";
		int formPgt = Integer
				.parseInt(JOptionPane.showInputDialog("1- Cartão de Crédito\n 2- Cartão de Débito\n 3- Dinheiro"));
		while (!valida) {
			if (formPgt == 1) {
				valida = true;
				formPgto = "Cartão de Crédito";
			} else if (formPgt == 2) {
				valida = true;
				formPgto = "Cartão de Débito";
			} else if (formPgt == 3) {
				valida = true;
				formPgto = "Dinheiro";
			} else {
				JOptionPane.showMessageDialog(null, "Dado inserido errado");
				continue;
			}
		}
		return formPgto;
	}

}
