package aula3.tratamentoerros.exceptions;

public class VendaException extends Exception {

	private static final long serialVersionUID = 1L;

	public VendaException() {
		super("A quantidade de itens não pode ser 0 nem maior que 10");
	}

}
