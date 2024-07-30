package aula2.poo.exercicio8;

public class Principal {

	public static void main(String[] args) {
		
		Automovel a = new Automovel();
		a.nome = "gol";
 		a.cor = "azul";
 		a.velocidade = 120;
 		a.acelerar();
 		
 		System.out.println("O carro " + a.nome + " é da cor " + a.cor + " e sua velocidade maxima é de " + a.velocidade + " km/h");

	}

}
