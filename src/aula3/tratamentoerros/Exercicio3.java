package aula3.tratamentoerros;


import java.util.Scanner;

import aula3.tratamentoerros.exceptions.ZeroException;

public class Exercicio3 {

	public static void main(String[] args) {
		
		
		
		try {
			int num = 9/0;
			
		}catch(ArithmeticException e) {
			System.err.println("Um numero não pode ser dividido por zero");
			e.printStackTrace();
		}
		
		try {
			int num2 = (Integer) null;
		}catch(NullPointerException e) {
			System.err.println("Um numero não pode ser nulo");
			e.printStackTrace();
		}
		
		try {
			String teste = "teste";
			System.out.println(teste.charAt(20));
		}catch(StringIndexOutOfBoundsException e) {
			System.err.println("Acessado posição inexistente da Palavra");
			e.printStackTrace();
		}
		
		try {
			Scanner sc = new Scanner(System.in);
			sc.close();
			sc.nextLine();
			
			
			
		}catch(IllegalStateException e) {
			System.err.println("Erro na ordem de execução");
			e.printStackTrace();
		}
		
		

	}
	
	

}
