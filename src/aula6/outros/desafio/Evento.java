package aula6.outros.desafio;

import java.time.LocalDateTime;

import javax.swing.JOptionPane;

public class Evento {

	public String descricao;
	public LocalDateTime dataHora;
	public TipoEvento tipoEvento;

	public Evento(String descricao, LocalDateTime dataHora, TipoEvento tipoEvento) {
		this.descricao = descricao;
		this.dataHora = dataHora;
		this.tipoEvento = tipoEvento;
	}

	public Evento() {

	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDateTime getDataHora() {
		return dataHora;
	}

	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}

	public TipoEvento getTipoEvento() {
		return tipoEvento;
	}

	public void setTipoEvento(TipoEvento tipoEvento) {
		this.tipoEvento = tipoEvento;
	}

	public void mostrarEnums() {
		for (TipoEvento tipo : TipoEvento.values()) {
			System.out.println(tipo);
		}
	}

	public void buscaEvento() {
		boolean valida = false;
		while (!valida) {
			String tipoEventoStr = JOptionPane.showInputDialog("Digite o tipo de evento conforme a lista abaixo:")
					.toUpperCase();
			try {
				TipoEvento tipoEvento = TipoEvento.valueOf(tipoEventoStr);
				this.tipoEvento = tipoEvento;
				JOptionPane.showMessageDialog(null, "Tipo de evento configurado como: " + this.tipoEvento);
				valida = true;
			} catch (IllegalArgumentException e) {
				JOptionPane.showMessageDialog(null, "Tipo de evento inválido. Por favor, insira um tipo válido.");
				continue;
			}
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Evento descricao: ");
		builder.append(descricao);
		builder.append(", data e Hora: ");
		builder.append(dataHora);
		builder.append(", tipo do evento: ");
		builder.append(tipoEvento);
		return builder.toString();
	}

}
