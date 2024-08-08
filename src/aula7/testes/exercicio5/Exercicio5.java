package aula7.testes.exercicio5;

import java.math.BigDecimal;
import java.math.RoundingMode;

import javax.swing.JOptionPane;

public class Exercicio5 {

	public static void main(String[] args) {

		Exercicio5 ex = new Exercicio5();
		System.out.println(ex.calcRaio(valorCircunferencia()));



	}

	public BigDecimal calcRaio(BigDecimal circunferencia) {
		BigDecimal pi = BigDecimal.valueOf(Math.PI);

		return circunferencia.divide(BigDecimal.valueOf(2).multiply(pi),4, RoundingMode.HALF_EVEN);
	}
	
	public static BigDecimal valorCircunferencia() {
		return new BigDecimal(JOptionPane.showInputDialog("Digite o valor da circunferencia: "));
	}
}
