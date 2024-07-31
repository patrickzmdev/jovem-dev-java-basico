package terceira_aula;

public class NotaMaiorQueDezException extends IllegalArgumentException{

	public NotaMaiorQueDezException(String mensagem) {
		super(mensagem);   // para acessar o erro da classe superior usa-se o super
	}
	
	public NotaMaiorQueDezException() {
		super("A nota não pode ser maior que 10");
	}
}
