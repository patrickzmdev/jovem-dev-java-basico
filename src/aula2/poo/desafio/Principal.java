package aula2.poo.desafio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		List<Carro> list = new ArrayList<>();
		
		
		String modelo ="";
		do {

			modelo = JOptionPane.showInputDialog("Digite o modelo do carro: ( caso queira sair digite fim) ");
			if(modelo.equals("fim")) {
				break;
			}
			int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de lançamento: "));

			
			list.add(new Carro(modelo, ano));

		} while (!modelo.equals("fim"));
		
		Collections.sort(list, Comparator.comparingInt(carro -> carro.ano));
		
		for(Carro carro : list) {
			System.out.println("Modelo: " + carro.modelo + ", Ano: " + carro.ano);
		}

	}
	

}
