package avaliacao.semana1.aplicacao;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

import avaliacao.semana1.Mostrador;
import avaliacao.semana1.entidades.Cliente;
import avaliacao.semana1.entidades.ItemVenda;
import avaliacao.semana1.subclasse.ClientePremium;

public class Venda {

	public static void main(String[] args) {
		ItemVenda iv = new ItemVenda();
		String tipoPagamento = " ";
		double desc = 0;
		Cliente c = new Cliente();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String validaNome = JOptionPane.showInputDialog("Digite o nome do cliente: ");
		if (validaNome.equals("Thiago")) {
			ClientePremium cp = new ClientePremium();
			cp.nome = validaNome;
			String data = JOptionPane.showInputDialog("Digite sua data de nascimento: (dd/MM/yyyy) ");
			LocalDate date = LocalDate.parse(data, format);
			cp.dataNascimento = date;
			c.nome = cp.nome;
			c.dataNascimento = cp.dataNascimento;

		} else {
			c.nome = validaNome;
			String data = JOptionPane.showInputDialog("Digite uma data de nascimento: (dd/MM/yyyy) ");
			LocalDate date = LocalDate.parse(data, format);
			c.dataNascimento = date;
		}

		iv.itensLista();
		iv.subTotal();
		int idadeCliente = 2024 - c.dataNascimento.getYear();
		if (idadeCliente > 60) {
			desc = 0.10;
			System.out.println("Descto. 10% terceira idade");
			System.out.println();
			System.out.println("Total..........................." + (iv.getSomaValor() - (iv.getSomaValor() * desc)));
		}
//		else if (c.dataNascimento.equals()) {
//			desc = 0.30;
//			System.out.println("Descto. 30% aniversario");
//		System.out.println();
//			System.out.println("Total..........................." + (iv.getSomaValor() - (iv.getSomaValor() * desc)));
//	}

		else if (c.nome.equals("Thiago")) {
			System.out.println("Descto. 20% cliente premium");
			System.out.println();
			System.out.println("Total..........................." + (iv.getSomaValor() - (iv.getSomaValor() * desc)));
		}

		else {
			System.out.println();
			System.out.println("Total..........................." + (iv.getSomaValor() - (iv.getSomaValor() * desc)));
		}

		int formPagamento = Integer.parseInt(JOptionPane.showInputDialog(
				"Digite a forma de pagamento:\n" + "1-Cartão de Crédito\n" + "2-Cartão de Débito\n" + "3-Dinheiro"));
		if (formPagamento == 1) {
			tipoPagamento = "Cartão de Crédito";
		} else if (formPagamento == 2) {
			tipoPagamento = "Cartão de Débito";
		} else if (formPagamento == 3) {
			tipoPagamento = "Dinheiro";
		}

		System.out.println("Forma de pagamento: " + tipoPagamento);
//		Mostrador mostrador = mensagem -> System.out.println(mensagem.charAt(0));

		int contCarac = c.nome.length();

		System.out.println(c.nome.charAt(0) + "*********");

	}
	/// Comentarios - faltou efetuar funcao lambda, method reference, mascara para
	/// ficar do tamanho correto(não lembrei como fazia) e o desconto de aniversario que não lembrei como
	/// acessa-va um mes e dia especifico

}
