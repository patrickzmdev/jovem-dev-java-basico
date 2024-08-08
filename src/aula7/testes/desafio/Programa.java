package aula7.testes.desafio;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JOptionPane;

public class Programa {

	static Map<String, List<Evento>> eventos = new HashMap<>();

	public static void main(String[] args) {

		eventos.put("futuros", new ArrayList<>());
		eventos.put("passados", new ArrayList<>());

		Evento ev = new Evento();
		ev.mostrarEnums();

		int op = 0;

		do {
			op = Integer.parseInt(JOptionPane.showInputDialog("1- Cadastrar Evento \n 2-Busca Evento \n 3-Sair"));
			switch (op) {
			case 1:
				Evento ev2 = new Evento();
				ev2.descricao = JOptionPane.showInputDialog("Digite qual o nome de evento: ");
				String tipoEventoStr = JOptionPane.showInputDialog("Digite o tipo de evento conforme a lista abaixo:")
						.toUpperCase();
				ev2.buscaEvento(tipoEventoStr);
				String data = JOptionPane.showInputDialog("Digite a data nesse formato: DD/MM/AAAA HH:mm");
				validaData(ev2, data);

				break;
			case 2:
				String eventoBuscaStr = JOptionPane
						.showInputDialog(null, "Digite o tipo de evento a procura conforme a lista abaixo:")
						.toUpperCase();
				buscaTipoEvento(eventoBuscaStr);

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

	public static void validaData(Evento ev, String date) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		try {
			LocalDateTime dataHora = LocalDateTime.parse(date, formatter);
			ev.setDataHora(dataHora);

			if (dataHora.isAfter(LocalDateTime.now())) {
				eventos.get("futuros").add(ev);
			} else {
				eventos.get("passados").add(ev);
			}

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Data em formato invalido");
			return;

		}

	}

	public static void buscaTipoEvento(String busca) {
		TipoEvento tipoEventoBusca = null;
		try {
			tipoEventoBusca = TipoEvento.valueOf(busca);
		} catch (IllegalArgumentException e) {
			JOptionPane.showMessageDialog(null, "Tipo de evento inválido");

		}

		System.out.println("----------Eventos Pesquisados-------------");
		System.out.println("Eventos futuros:");
		for (Evento evento : eventos.get("futuros")) {
			if (evento.getTipoEvento() == tipoEventoBusca) {
				System.out.println(evento.getDescricao());
			}
		}

		System.out.println("Eventos passados:");
		for (Evento evento : eventos.get("passados")) {
			if (evento.getTipoEvento() == tipoEventoBusca) {
				System.out.println(evento.getDescricao());

			}
		}
		System.out.println("-----------------------------------------");

	}

}
