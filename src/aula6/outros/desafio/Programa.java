package aula6.outros.desafio;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Programa {

	public static void main(String[] args) {

		List<Evento> evPassados = new ArrayList<>();
		List<Evento> evFuturos = new ArrayList<>();

		Evento ev = new Evento();
		ev.mostrarEnums();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		int op = 0;

		do {
			op = Integer.parseInt(JOptionPane.showInputDialog("1- Cadastrar Evento \n 2-Busca Evento \n 3-Sair"));
			switch (op) {
			case 1:
				Evento ev2 = new Evento();
				ev2.descricao = JOptionPane.showInputDialog("Digite qual era o nome de evento: ");

				
				ev2.buscaEvento();
				try {
					String data = JOptionPane.showInputDialog("Digite a data nesse formato: DD/MM/AAAA HH:mm");
					ev2.dataHora = LocalDateTime.parse(data, formatter);
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Data em formato invalido");
					return;
				}
				if (ev2.dataHora.isAfter(LocalDateTime.now())) {
					evFuturos.add(ev2);
				} else {
					evPassados.add(ev2);
				}

				break;
			case 2:
				String eventoBuscaStr = JOptionPane
						.showInputDialog(null, "Digite o tipo de evento a procura conforme a lista abaixo:")
						.toUpperCase();
				TipoEvento tipoEventoBusca;
				try {
					tipoEventoBusca = TipoEvento.valueOf(eventoBuscaStr);
				} catch (IllegalArgumentException e) {
					JOptionPane.showMessageDialog(null, "Tipo de evento inválido");
					continue;
				}

				System.out.println("----------Eventos Pesquisados-------------");
				System.out.println("Eventos futuros:");
				for (Evento evento : evFuturos) {
					if (evento.getTipoEvento() == tipoEventoBusca) {
						System.out.println(evento.getDescricao());
					}
				}

				System.out.println("Eventos passados:");
				for (Evento evento : evPassados) {
					if (evento.getTipoEvento() == tipoEventoBusca) {
						System.out.println(evento.getDescricao());
						
					}
				}
				System.out.println("-----------------------------------------");
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "Saindo......");

				break;
			default:
				JOptionPane.showMessageDialog(null, "Comando errado");
				break;
			}

		} while (op != 3);

	}

}
