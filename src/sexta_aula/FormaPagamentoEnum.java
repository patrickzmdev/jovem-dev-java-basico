package sexta_aula;

import java.util.function.Function;

public enum FormaPagamentoEnum {

	CARTAO_CREDITO(1, "cartao de credito", vb -> vb), 
	CARTAO_DEBITO(2, "cartao de debito", vb -> vb),
	DINHEIRO(3, "dinheiro", vb -> vb * 0.90), 
	PIX(17, "pix", vb -> vb * 0.90);

	private int codigo;
	private String descricao;
	private Function<Double, Double> desconto;

	private FormaPagamentoEnum(int codigo, String descricao, Function<Double, Double> desconto) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.desconto = desconto;

	}

	public int getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public Function<Double, Double> getDesconto() {
		return desconto;
	}

}
