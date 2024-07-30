package aula2.poo.desafio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		Set<List<String>> set = new HashSet<>();
		List<Integer> list = new ArrayList<Integer>();
		List<String> list2 = new ArrayList<String>();
		Carro c = new Carro();
		
		
		
		do {

			c.modelo = JOptionPane.showInputDialog("Digite o modelo do carro: ( caso queira sair digite fim) ");
			if(c.modelo.equals("fim")) {
				break;
			}
			c.ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de lançamento: "));

			list.add(c.ano);
			
			

			Collections.sort(list2);
			list2.add(c.modelo.toString());

		} while (!c.modelo.equals("fim"));

		set.add(list2);
		System.out.println(set);

	}

}
