package aula2.poo.desafio;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		Map<String, Integer> hash = new HashMap<>();
		Carro c = new Carro();

		 do{
			c.modelo = JOptionPane.showInputDialog("Digite o modelo do carro: ( caso queira sair digite fim) ");
			c.ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de lançamento: "));

			hash.put(c.modelo, c.ano);
			
		}while (!c.modelo.equals("fim"));
		 
		System.out.println(hash); 

	}

}
