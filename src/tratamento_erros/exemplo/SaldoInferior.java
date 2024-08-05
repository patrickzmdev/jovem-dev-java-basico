package tratamento_erros.exemplo;

public class SaldoInferior extends Exception {

	private static final long serialVersionUID = 1L;

	public SaldoInferior() {
		super("Você nao possui no momento esse valor para saque");
	}

}
