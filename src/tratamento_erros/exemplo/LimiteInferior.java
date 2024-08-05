package tratamento_erros.exemplo;

public class LimiteInferior extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public LimiteInferior() {
		super("Saque superior ao limite permitido");
	}
}
