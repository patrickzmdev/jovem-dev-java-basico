package avalicao.semana1.versaomelhorada.entidades;

public class Produto {
	
	String nome;
	double preco;
	String descricao;
	int quantidade;
	
	public Produto(String nome, double preco, String descricao) {
		
		this.nome = nome;
		this.preco = preco;
		this.descricao = descricao;
	}
	
	

	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}



	@Override
	public String toString() {
		return nome + "\nPreco: " + String.format("%.2f", preco) + "R$\nDescricao: " + descricao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}



	public int getQuantidade() {
		return quantidade;
	}



	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
	
	
	
	
	

}
