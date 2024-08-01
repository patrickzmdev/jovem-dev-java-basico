package aula3.tratamentoerros.exceptions;

public class PrecoIncorretoException extends IllegalArgumentException{

	public PrecoIncorretoException() {
		super("O preço do item deve ser maior que zero");
	}
}
