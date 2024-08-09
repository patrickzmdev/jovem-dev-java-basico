package sistema_farmacia.aplicacao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

import sistema_farmacia.entidades.Farmacia;
import sistema_farmacia.entidades.FarmaciaOnline;
import sistema_farmacia.entidades.Medicamento;
import sistema_farmacia.enums.TipoMedicamento;

public class Programa {

	public static void main(String[] args) throws IllegalAccessException {
		
		Farmacia f = new Farmacia();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		int op = 0;
		int idCad = 1;
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog("Bem vindo ao Sistema de Farmacia"
					+ "\n 1 - Cadastrar Medicamento " + "\n " + "2 - Remover Medicamento"
					+ "\n 3 - Atualizar Preço do Medicamento" + "\n 4 - Busca por Medicamento"
					+ "\n 5 - Listar Estoque" + "\n 6 - Valor Compra" + "\n 7 - Sair"));
			switch (op) {
			case 1:
				Medicamento m = new Medicamento();
				m.setId(idCad);
				m.setNome(JOptionPane.showInputDialog("Digite o nome do medicamento: "));
				m.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do medicamento: ")));
				TipoMedicamento.mostrarOpcoes();
				String escolhaMedicamento = JOptionPane.showInputDialog("Digite o tipo de medicamento: ").toUpperCase();
				TipoMedicamento.validarEnum(escolhaMedicamento);
				m.setTipo(TipoMedicamento.valueOf(escolhaMedicamento));
				String data = JOptionPane.showInputDialog("Digite a data de validade nesse formato: dd/mm/aaaa hh:mm");
				LocalDateTime dataValidade = LocalDateTime.parse(data,formatter);
				m.setDataValidade(dataValidade);

				f.adicionarMedicamento(m);
				idCad += 1;
				break;
			case 2:
				int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o id do medicamento que você deseja excluir"));
				f.removerMericamento(id);
				break;
			case 3:
				id = Integer.parseInt(JOptionPane.showInputDialog("Digite o id do medicamento que você deseja alterar o preço"));
				double novoPreco = Double.parseDouble(JOptionPane.showInputDialog("Digite o novo valor do medicamento: "));
				f.atualizarPreco(id, novoPreco);
				break;
			case 4:
				String busca = JOptionPane.showInputDialog("Digite o nome do medicamento a ser buscado: ");
				System.out.println(f.buscaPorNome(busca));
				break;
			case 5:
				f.mostrarEstoque();
				
				break;
			case 6:
				FarmaciaOnline fo = new FarmaciaOnline();
				 // Cria um mapa para armazenar o ID do medicamento e a quantidade
				Map<Integer, Integer> quantidades = new HashMap<>();
				
				// Solicita ao usuário o ID do medicamento e a quantidade
				id = Integer.parseInt(JOptionPane.showInputDialog("Digite o id do medicamento que você deseja vender:"));
				int qnt = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos medicamentos você quer vender:"));
				// Adiciona a entrada ao mapa
				quantidades.put(id, qnt);
				
				// Calcula o valor total da compra usando o método da instância atual de Farmacia
			    double total = f.calcularValorTotalCompra(quantidades);
			    
			 // Exibe o valor total da compra
			    JOptionPane.showMessageDialog(null, "Valor total da compra: R$ " + total);
			    break;
			
			case 7:
				JOptionPane.showMessageDialog(null, "Saindo ...");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Valor incorreto");
			}

		} while (op != 7);

	}

}
