package aula1.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JOptionPane;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Map<Integer, String> mapa = new HashMap<>();
		String frase = JOptionPane.showInputDialog("Digite uma frase: ");
		
		for (int i = 0; i < frase.length(); i++) {
			mapa.put(null, frase);
		}
		
		System.out.println(mapa);

	}


}
