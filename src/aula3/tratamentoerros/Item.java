package aula3.tratamentoerros;

public class Item {
	
	String nome;
	double preco;
	
	public Item(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Item: nome:" + nome + ", preco: R$" + preco ;
	}
	
	

}
