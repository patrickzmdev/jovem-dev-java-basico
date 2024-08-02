package aula4.lambda;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Desafio {

	public static void main(String[] args) {
		
	List<String> lista = new ArrayList<String>(5);
	
	for(int i = 1; i < 6; i++) {
		String n = JOptionPane.showInputDialog("Digite uma palavra");
		lista.add(n);
	}
		System.out.println(lista);
		
		Mostrador mostrador = mensagem -> System.out.println(mensagem.toUpperCase());

		for(String s : lista) {
			mostrador.mostra(s);
		}
	}

}
