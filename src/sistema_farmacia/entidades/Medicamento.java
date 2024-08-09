package sistema_farmacia.entidades;

import java.time.LocalDateTime;

import sistema_farmacia.enums.TipoMedicamento;

public class Medicamento {
	
	private int id;
	private String nome;
	private TipoMedicamento tipo;
	private double preco;
	private LocalDateTime dataValidade;
	
	public Medicamento(int id, String nome, TipoMedicamento tipo, double preco, LocalDateTime dataValidade) {
		this.id = id;
		this.nome = nome;
		this.tipo = tipo;
		this.preco = preco;
		this.dataValidade = dataValidade;
	}
	
	
	
	 public Medicamento() {
		
	}



	@Override
	    public String toString() {
	        return String.format("ID: %d, Nome: %s, Tipo: %s, Preço: %.2f, Validade: %s",
	                id, nome, tipo, preco, dataValidade);
	    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TipoMedicamento getTipo() {
		return tipo;
	}

	public void setTipo(TipoMedicamento tipo) {
		this.tipo = tipo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public LocalDateTime getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(LocalDateTime dataValidade) {
		this.dataValidade = dataValidade;
	}
	
	
	
	
	

}
