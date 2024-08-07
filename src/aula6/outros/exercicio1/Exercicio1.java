package aula6.outros.exercicio1;

public class Exercicio1 {

	public static void main(String[] args) {
		
		for(DiaSemanaEnum nome : DiaSemanaEnum.values()) {
			System.out.println(nome.getNome() + " " +  nome.isFimDeSemana());
			
		}

	}

}
