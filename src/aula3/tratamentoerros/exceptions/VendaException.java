package aula3.tratamentoerros.exceptions;

public class VendaException extends Exception {
	
	public VendaException() {
		super("A quantidade de itens não pode ser 0 nem maior que 10");
	}

}
