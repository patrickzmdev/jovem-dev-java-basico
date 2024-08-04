package avalicao.semana1.versaomelhorada.entidades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JOptionPane;

import avalicao.semana1.versaomelhorada.validacao.QuantidadeProduto;

public class Venda {

	List<Produto> listaCompra = new ArrayList<>();

	public void buscaProduto(List<Produto> lista) throws QuantidadeProduto {

		String nomeProduto = JOptionPane.showInputDialog("Digite o nome do produto que você deseja: ");
		for (Produto p : lista) {
			if (p.getNome().equalsIgnoreCase(nomeProduto)) {
				JOptionPane.showMessageDialog(null, "Produto: " + p);
				try {
					p.quantidade = Integer
							.parseInt(JOptionPane.showInputDialog("Quantas unidades você deseja do produto: "));
					if (p.quantidade < 1 || p.quantidade > 50) {
						throw new QuantidadeProduto();
					}
				} catch (QuantidadeProduto e) {
					JOptionPane.showMessageDialog(null, e.getMessage());
					return;
				}
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
		return listaCompra.stream().mapToDouble(produto -> produto.getPreco() * produto.getQuantidade()).sum();
	}

	public String valorTotal(Double desc) {
		return String.format("%.2f", valorSubTotal() - valorSubTotal() * desc);

	}

	public void imprimirCupom() {
		System.out.println();
		System.out.println();
		System.out.println("--------------------CUPOM--------------------");
		for (Produto produto : listaCompra) {
			System.out.println(produto.getNome());
			System.out.println(produto.getQuantidade() + "x " + String.format("%.2f", produto.getPreco()) + "  .........................  "
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
				JOptionPane.showMessageDialog(null, "Dado inserido inexistente");
				continue;
			}
		}
		return formPgto;
	}

}
