package avalicao.semana1.versaomelhorada.validacao;

public class QuantidadeProduto extends Exception {

	private static final long serialVersionUID = 1L;

	public QuantidadeProduto() {
		super("Proibido quantidade de produtos menor que 0 e maior que 50");
	}
}
