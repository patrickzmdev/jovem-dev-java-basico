package tratamento_erros_udemy.primeira_versao.entidades;

public class DomainException extends RuntimeException {

	
	private static final long serialVersionUID = 1L;
	
	public DomainException(String msg) {
		super(msg);
	}
	

}
