package sexta_aula;

public class ExplicacaoEnum {

	public static void main(String[] args) {

		System.out.println(FormaPagamentoEnum.CARTAO_CREDITO.ordinal()); // ordinal mostra a posicao do enum no// arquivo

		System.out.println(FormaPagamentoEnum.CARTAO_CREDITO.getDescricao());
		
		
		for(FormaPagamentoEnum f: FormaPagamentoEnum.values()) { //values serve para acessar todos os enuns
			System.out.println(f.getCodigo() + " " + f.getDescricao());
		}
		
		System.out.println(FormaPagamentoEnum.valueOf("PIX").getCodigo()); //valueOf pega uma string atraves de uma string
		
		FormaPagamentoEnum f = FormaPagamentoEnum.DINHEIRO;
		
		
		
		Double valorOriginal = 100.0;
        Double valorComDesconto = f.getDesconto().apply(valorOriginal);
        System.out.println(valorComDesconto);
		
		switch (f) {
		case CARTAO_CREDITO:
			System.out.println(f.getCodigo());
			break;
		case DINHEIRO:
			System.out.println(f.getCodigo());
			break;
		default:
			System.out.println(f.getCodigo() + "Default");
			break;
		}	
		
		if (f.equals(FormaPagamentoEnum.DINHEIRO)) {
			System.out.println("funcionou");
		}
		
	}

}
