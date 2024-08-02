package aula4.lambda;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {

		List<Aluno> aluno = new ArrayList<>();

		for (int i = 1; i < 6; i++) {
			Aluno a = new Aluno();
			

			boolean valida = false;
			while (!valida) {
				try {
					a.nome = JOptionPane.showInputDialog("Digite o nome do " + (i) + " aluno");
					a.numeroChamada = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero do " + (i) + " aluno"));
					String data = JOptionPane
							.showInputDialog("Digite a data de nascimento do " + i + "º aluno (AAAA-MM-DD)");
					a.dataNascimento = Date.valueOf(data);
					valida = true;

				}catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Houve algum erro na digitação");
				}
				catch (IllegalArgumentException e) {
					JOptionPane.showMessageDialog(null, "Data invalida. Tente novamente");
				}

				aluno.add(a);
			}
		}

		aluno.sort(Comparator.comparing(Aluno::getDataNascimento));

		aluno.forEach(System.out::println);

	}

}
