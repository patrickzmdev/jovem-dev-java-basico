package aula5.stream.exceptions;

public class ZeroBertoException extends Exception{
	
	
	private static final long serialVersionUID = 1L;

	public ZeroBertoException(String string) {
		super("Nao há nenhum nome que termine com berto");
	}

}
