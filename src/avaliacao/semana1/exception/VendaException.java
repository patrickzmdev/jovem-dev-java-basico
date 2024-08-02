package avaliacao.semana1.exception;

public class VendaException extends Exception{
	

		private static final long serialVersionUID = 1L;

		public VendaException() {
			super("A quantidade de itens não pode ser 0 nem maior que 50");
		}




}
