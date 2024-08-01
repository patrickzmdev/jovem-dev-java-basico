package enumeracao.composicao.aplication;

import java.awt.HeadlessException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

import enumeracao.composicao.entities.ContratoHora;
import enumeracao.composicao.entities.Departamento;
import enumeracao.composicao.entities.Trabalhador;
import enumeracao.composicao.entities.enums.NivelTrabalhador;

public class Programa {

	public static void main(String[] args) throws HeadlessException, ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String nomeDep = JOptionPane.showInputDialog("Entre com o nome do departamento: ");
		String nomeTrab = JOptionPane.showInputDialog("Digite o nome do trabalhador:");
		String nivelTrab = JOptionPane.showInputDialog("Digite o nivel do trabalhador:");
		double salTrab = Double.parseDouble(JOptionPane.showInputDialog("Digite o salario do trabalhador: "));

		Trabalhador trabalhador = new Trabalhador(nomeTrab, NivelTrabalhador.valueOf(nivelTrab), salTrab,
				new Departamento(nomeDep));
		int n =Integer.parseInt(JOptionPane.showInputDialog("Quantos contratos esse trabalhador terá? "));
		
		for (int i = 1; i<=n; i++) {
			JOptionPane.showMessageDialog(null, "Entre com os dados do " + (i) + " contrato: ");
			Date dataContrato = sdf.parse(JOptionPane.showInputDialog("Digite a data (DD/MM/AAAA)"));
			double valHora = Double.parseDouble(JOptionPane.showInputDialog("Valor por hora:"));
			int horas = Integer.parseInt(JOptionPane.showInputDialog("Duração(horas):"));
			ContratoHora contract = new ContratoHora(dataContrato, valHora, horas);
			trabalhador.addContrato(contract);
			
			
		}
		
		String mesAno = JOptionPane.showInputDialog("Entre com o mes e ano para fazer o calculo (MM/AAAA):");
		int mes = Integer.parseInt(mesAno.substring(0,2));
		int ano = Integer.parseInt(mesAno.substring(3));
		JOptionPane.showMessageDialog(null, "Nome:" + trabalhador.getNome());
		JOptionPane.showMessageDialog(null, "Departamento:" + trabalhador.getDepartamento().getNome());
		JOptionPane.showMessageDialog(null, "Valor Ganho:" + mesAno + ":" + String.format("%.2f", trabalhador.valorGanho(ano, mes)));
		
		
		
	}

}
