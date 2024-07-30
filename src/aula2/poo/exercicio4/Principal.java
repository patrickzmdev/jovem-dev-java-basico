package aula2.poo.exercicio4;

public class Principal {

	public static void main(String[] args) {
		
		Carro c = new Carro();
		c.ano = "2010";
		c.cor = "Azul";
		c.modelo = "Gol";
		
		Carro d = new Carro();
		d.ano = "2011";
		d.cor = "Branco";
		d.modelo = "Golf";
		
		Carro e = new Carro();
		e.ano = "2012";
		e.cor = "Cinza";
		e.modelo = "Palio";
		
		System.out.println(c.mostrarDados());
		System.out.println(d.mostrarDados());
		System.out.println(e.mostrarDados());

	}

}
