package tratamento_erros.exemplo;

import javax.swing.JOptionPane;

public class Programa {


	public static void main(String[] args) {
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da conta: "));
		String cliente = JOptionPane.showInputDialog("Digite o nome do cliente");
		double saldo = Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo em conta: "));
		double limSaque = Double.parseDouble(JOptionPane.showInputDialog("Digite o limite de saque: "));
		Conta conta = new Conta(numero, cliente, saldo, limSaque);
		int op = 0;

		do {
			op = Integer.parseInt(JOptionPane.showInputDialog("1 - Depósito\n" + "2 - Saque\n" + "3 - Sair"));
			switch (op) {
			case 1:
				conta.deposito();
				break;
			case 2:
				conta.saque();
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "Encerrando aplicação");
				break;
			}

		} while (op != 3);

	}

	

}
