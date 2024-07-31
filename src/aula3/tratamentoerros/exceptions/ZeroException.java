package aula3.tratamentoerros.exceptions;

public class ZeroException extends IllegalArgumentException{
	
	public ZeroException() {
		super("O segundo numero não pode ser zero");
	}

}
