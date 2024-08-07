package aula6.outros.exercicio5;

import java.math.BigDecimal;
import java.math.RoundingMode;

import javax.swing.JOptionPane;

public class Exercicio5 {

	public static void main(String[] args) {

		BigDecimal circunferencia = new BigDecimal(JOptionPane.showInputDialog("Digite o valor do raio: "));

		BigDecimal pi = BigDecimal.valueOf(Math.PI);

		BigDecimal raio = circunferencia.divide(BigDecimal.valueOf(2).multiply(pi),4, RoundingMode.HALF_EVEN);

		System.out.println("valor do raio é "  + raio);

	}

}
