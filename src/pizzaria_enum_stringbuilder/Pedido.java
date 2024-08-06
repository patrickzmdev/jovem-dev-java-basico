package pizzaria_enum_stringbuilder;

public class Pedido {
	
	public int numPedido;
	public TipoPizza tipoPizza;
	public int qnt;
	
	
	
	public Pedido() {
		
	}

	public Pedido(int numPedido, TipoPizza tipoPizza, int qnt) {
		this.numPedido = numPedido;
		this.tipoPizza = tipoPizza;
		this.qnt = qnt;
	}
	
	public String exibirDetalhes() {
		StringBuilder sb = new StringBuilder();
		sb.append("Pedido numero: " + numPedido + "\n");
		sb.append("Tipo de pizza: " + tipoPizza + "\n");
		sb.append("Quantidade: " + qnt + "\n");
		sb.append("Preço Unitario: R$ " + tipoPizza.getPreco() + "\n");
		sb.append("Preço Final: R$ " + tipoPizza.getPreco() * qnt );
		return sb.toString();
		
		
	}
	
	

}
