package pizzaria_enum_stringbuilder;


public enum TipoPizza {

	MARGUERITA(90.00), PEPPERONI(85.00), QUATRO_QUEIJOS(80.00), CALABRESA(70.00), VEGETARIANA(67.00);

	private double preco;

	TipoPizza(double preco) {
		this.preco = preco;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public static void mostrarOpcoes() {
		for (TipoPizza tipo : TipoPizza.values()) {
			System.out.println(tipo.ordinal() + 1 + ". " + tipo + " - R$ " + tipo.getPreco());
		}
	}
	
	public static TipoPizza escolherTipoPizza(int opcao) {
		return TipoPizza.values()[opcao - 1];
	}

}
