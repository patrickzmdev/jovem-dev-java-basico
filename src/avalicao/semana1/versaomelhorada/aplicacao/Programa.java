package avalicao.semana1.versaomelhorada.aplicacao;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

import avalicao.semana1.versaomelhorada.entidades.Cliente;
import avalicao.semana1.versaomelhorada.entidades.ItemVenda;
import avalicao.semana1.versaomelhorada.entidades.Produto;
import avalicao.semana1.versaomelhorada.entidades.Venda;

public class Programa {

	public static void main(String[] args) {

		Venda v = new Venda();
		ItemVenda itemVenda = new ItemVenda();
		Cliente c = new Cliente();
		double desc = 0;

		itemVenda.adicionarProduto(new Produto("arroz", 4.90, "Arroz Branco"));
		itemVenda.adicionarProduto(new Produto("feijao", 7.90, "Feijão Carioca"));
		itemVenda.adicionarProduto(new Produto("ovo", 5.90, "Duzia"));
		itemVenda.adicionarProduto(new Produto("detergente", 2.90, "Limpol"));
		itemVenda.adicionarProduto(new Produto("trigo", 6.90, "Dona Benta "));
		itemVenda.adicionarProduto(new Produto("refrigerante", 8.90, "Coca cola 2lt"));
		itemVenda.adicionarProduto(new Produto("agua", 1.90, "500ml"));
		itemVenda.adicionarProduto(new Produto("macarrao", 3.50, "Espaguete"));
		itemVenda.adicionarProduto(new Produto("oleo", 4.00, "Soia"));
		itemVenda.adicionarProduto(new Produto("margarina", 5.30, "Becel"));

		System.out.println("---------------Bem vindo a nossa Venda----------------");
		itemVenda.produtosLoja();

		c.nome = JOptionPane.showInputDialog("Insira seu nome: ");
		String data = JOptionPane.showInputDialog("Insira a sua data de nascimento:dd/mm/aaaa");
		c.dataNasc = Cliente.conversaoData(data);

		boolean fimCompra = false;

		while (!fimCompra) {
			String compra = JOptionPane.showInputDialog("Para prosseguir a compra: sim ou fim").toLowerCase();
			if (compra.equals("fim")) {
				JOptionPane.showMessageDialog(null, "Encerrando Compra");
				fimCompra = true;

			} else {
				v.buscaProduto(itemVenda.listaProduto);

			}
		}

		v.imprimirCupom();

		if (c.estaDeAniversario()) {
			desc = 0.3;
			System.out.println();
			System.out.println("Descto. 30% aniversario");
			System.out.println();
			System.out.println("Total ......................  " + v.valorTotal(desc));
		} else if (c.calcularIdade() > 60) {
			desc = 0.1;
			System.out.println();
			System.out.println("Descto. 10% terceira idade");
			System.out.println();
			System.out.println("Total ......................  " + v.valorTotal(desc));

		} else {
			System.out.println();
			System.out.println("Total ......................  " + v.valorTotal(desc));
		}

		System.out.println("Forma de pagamento: " + v.formaPagamento());
		System.out.println("Cliente: " + c.mascaraNome(c.nome));

	}

}
