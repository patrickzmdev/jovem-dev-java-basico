package avalicao.semana1.versaomelhorada.aplicacao;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.IllegalFormatException;

import javax.swing.JOptionPane;

import avalicao.semana1.versaomelhorada.entidades.Cliente;
import avalicao.semana1.versaomelhorada.entidades.ClientePremium;
import avalicao.semana1.versaomelhorada.entidades.ItemVenda;
import avalicao.semana1.versaomelhorada.entidades.Produto;
import avalicao.semana1.versaomelhorada.entidades.Venda;
import avalicao.semana1.versaomelhorada.validacao.QuantidadeProduto;

public class Programa {

	public static void main(String[] args) throws QuantidadeProduto {

		Venda v = new Venda();
		ItemVenda itemVenda = new ItemVenda();
		Cliente c = new Cliente();
		boolean clPremium = false;
		ClientePremium cp = new ClientePremium();
		double desc = 0;

		Produto[] produtos = { new Produto("arroz", 4.90, "Arroz Branco"),
				new Produto("feijao", 7.90, "Feijão Carioca"), new Produto("ovo", 5.90, "Duzia"),
				new Produto("detergente", 2.90, "Limpol"), new Produto("trigo", 6.90, "Dona Benta "),
				new Produto("refrigerante", 8.90, "Coca cola 2lt"), new Produto("agua", 1.90, "500ml"),
				new Produto("macarrao", 3.50, "Espaguete"), new Produto("oleo", 4.00, "Soia"),
				new Produto("margarina", 5.30, "Becel") };

		Arrays.stream(produtos).forEach(itemVenda::adicionarProduto);

		System.out.println("---------------Bem vindo a nossa Venda----------------");
		itemVenda.produtosLoja();

		c.nome = JOptionPane.showInputDialog("Insira seu nome: ").toLowerCase();
		if (c.nome.equals("thiago")) {
			cp.nome = "thiago";
			clPremium = true;
		}
		c.dataNasc = null;
		while (c.dataNasc == null) {
			String data = JOptionPane.showInputDialog("Insira a sua data de nascimento:dd/mm/aaaa");

			c.dataNasc = Cliente.conversaoData(data);
			if (c.dataNasc == null) {
				JOptionPane.showMessageDialog(null, "Data invalida. Por favor insira os dados corretamente");
			}

		}

		boolean fimCompra = false;

		while (!fimCompra) {
			String compra = JOptionPane.showInputDialog("Para prosseguir a compra: sim ou fim").toLowerCase();
			if (compra.equals("fim")) {
				JOptionPane.showMessageDialog(null, "Encerrando Compra");
				fimCompra = true;

			} else if (compra.equals("sim")) {
				v.buscaProduto(itemVenda.listaProduto);

			} else {
				JOptionPane.showMessageDialog(null, "Erro na digitação");
				continue;
			}
		}

		v.imprimirCupom();

		if (c.estaDeAniversario()) {
			desc = 0.3;
			System.out.println("Descto. 30% aniversario");
			System.out.println();
			System.out.println("Total ......................  " + v.valorTotal(desc));
		} else if (clPremium) {
			desc = 0.2;
			System.out.println("Descto. 20% cliente premium");
			System.out.println();
			System.out.println("Total ......................  " + v.valorTotal(desc));
		} else if (c.calcularIdade() > 60) {
			desc = 0.1;
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
