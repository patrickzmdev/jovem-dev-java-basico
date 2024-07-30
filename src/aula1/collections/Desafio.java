package aula1.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JOptionPane;

public class Desafio {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<String>();
		String palavra = " ";
		while (palavra != "fim") {
			palavra = JOptionPane.showInputDialog("Digite uma palavra:(para encerrar digite (fim)").toLowerCase();
			if (palavra.equals("fim")) {
				break;
			}
			palavras.add(palavra);
		}
		Collections.sort(palavras);
		System.out.println(palavras);

		Map<String, List<String>> mapa = new HashMap<>();
		mapa.put("a", new ArrayList<String>());
		mapa.put("e", new ArrayList<String>());
		mapa.put("i", new ArrayList<String>());
		mapa.put("o", new ArrayList<String>());
		mapa.put("u", new ArrayList<String>());

		for (String palavraAtual : palavras) {

			for (String chave : mapa.keySet()) {
				if (palavraAtual.contains(chave)) {
					mapa.get(chave).add(palavraAtual);
				}
			}

		}

		System.out.println(mapa);

	}

}
