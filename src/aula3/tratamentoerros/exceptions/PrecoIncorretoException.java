package aula3.tratamentoerros.exceptions;

public class PrecoIncorretoException extends IllegalArgumentException {

	private static final long serialVersionUID = 1L;

	public PrecoIncorretoException() {
		super("O preço do item deve ser maior que zero");
	}

}
