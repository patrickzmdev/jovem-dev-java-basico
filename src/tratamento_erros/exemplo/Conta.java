package tratamento_erros.exemplo;

import javax.swing.JOptionPane;

public class Conta {

	private int numero;
	private String nome;
	private double saldo;
	private static double limSaque;

	public Conta(int numero, String nome, double saldo, double limSaque) {

		this.numero = numero;
		this.nome = nome;
		this.saldo = saldo;
		this.limSaque = limSaque;
	}
	
	

	public int getNumero() {
		return numero;
	}



	public void setNumero(int numero) {
		this.numero = numero;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public double getSaldo() {
		return saldo;
	}



	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}



	public static double getLimSaque() {
		return limSaque;
	}

	public static void setLimSaque(double limSaque) {
		Conta.limSaque = limSaque;
	}

	public void deposito() {
		double valorDep = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser depositado: "));
		setSaldo(getSaldo() + valorDep);
		System.out.println(getSaldo());

	}

	public void saque() {
		try {
			double valorSaq = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser sacado: "));
			if (getSaldo() < valorSaq) {
				throw new SaldoInferior();
			}
			if (valorSaq > getLimSaque()) {
				throw new LimiteInferior();
			}
			setSaldo(getSaldo() - valorSaq);
			System.out.println(getSaldo());
		} catch (SaldoInferior e) {
			System.err.println(e.getMessage());
			return;
		} catch (LimiteInferior e) {
			System.err.println(e.getMessage());
			return;
		}

	}

}
