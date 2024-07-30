package aula2.poo.exercicio7;

public class Principal {

	public static void main(String[] args) {
		
		NotaFiscal nf1 = new NotaFiscal();
		nf1.emitente = "Emitente1";
		System.out.println("Nota Fiscal emitida por: " + nf1.emitente + ", valor: " + nf1.calculaValor());
		

		NotaFiscal nf2 = new NotaFiscal();
		nf2.emitente = "Emitente2";
		System.out.println("Nota Fiscal emitida por: " + nf2.emitente + ", valor: " + nf2.calculaValor());
		

	}

}
