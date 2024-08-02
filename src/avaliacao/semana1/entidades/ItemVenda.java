package avaliacao.semana1.entidades;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import avaliacao.semana1.exception.VendaException;

public class ItemVenda {

	List<Produto> listaProduto = new ArrayList<>();
	Produto p = new Produto();
	double somaValor = 0;

	public double getSomaValor() {
		return somaValor;
	}

	public void setSomaValor(double somaValor) {
		this.somaValor = somaValor;
	}

	public void itensLista() {
		System.out.println("**************CUPOM*****************");
		boolean continua = true;

		do {

			p.nomeProduto = JOptionPane.showInputDialog("Digite o nome do produto (para sair digite fim)");
			if (p.nomeProduto.equals("fim")) {
				continua = false;
				return;
			}
			try {
				p.precoProduto = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto:"));
				p.qntProduto = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade do produto:"));
				if (p.qntProduto <= 0 || p.qntProduto > 50) {
					throw new VendaException();
				}
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Inserido valor invalido");
				continue;

			} catch (VendaException e) {
				JOptionPane.showMessageDialog(null, "Inserido quantidade invalida");
				continue;
			}

			listaProduto.add(p);

			somaValor += p.qntProduto * p.precoProduto;
			System.out.println(p.nomeProduto);
			System.out.println(
					p.qntProduto + " x " + p.precoProduto + " ...................... " + p.qntProduto * p.precoProduto);
			System.out.println();

		} while (continua);

	}

	public void subTotal() {
		System.out.println("SubTotal ......................" + somaValor);
		System.out.println();
	}

}
