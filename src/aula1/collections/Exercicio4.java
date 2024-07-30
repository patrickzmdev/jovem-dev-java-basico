package aula1.collections;

import java.util.HashMap;

import java.util.Map;

import javax.swing.JOptionPane;

public class Exercicio4 {

	public static void main(String[] args) {

		Map<Character, Integer> mapa = new HashMap<>();
		String frase = JOptionPane.showInputDialog("Digite uma frase: ");
		for (int i = 0; i < frase.length(); i++) {
			char letras = frase.charAt(i);
			int cont = 0;

			for (int j = 0; j < frase.length(); j++) {
				if (frase.charAt(j) == letras) {
					cont += 1;
				}

			}

			mapa.put(letras, cont);
		}

		System.out.println(mapa);
	}

}
