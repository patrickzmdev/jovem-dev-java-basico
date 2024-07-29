package primeira_aula;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		
		//lista permite dados iguais
		List<String> lista = new ArrayList<String>();
		lista.add("Elemento 1");
		lista.add("Elemento 2");
		System.out.println(lista.get(0));
		System.out.println(lista.get(1));
		lista.remove(0);
		//lista.remove(1);// erro pois ao remover um valor o valor passa para o espaco a frente
		System.out.println(lista.isEmpty());
		
		//hash set nao permite dados iguais
		Set<String> conjunto = new HashSet<>();
		conjunto.add("Elemento 1"); // se colocar 2 valores iguais ele não salva em hashSet
		conjunto.add("Elemento 2");
		conjunto.add("Elemento 3");
		conjunto.add("Elemento 1");
		System.out.println(conjunto.size());
		
		conjunto.remove("Elemento 1");
		System.out.println(conjunto.size());
		
		//hashmap
		
		Map<Integer, String> mapa = new HashMap<>();
		mapa.put(20, "Jose");
		mapa.put(35, "Maria");
		
		System.out.println(mapa.get(35));
		mapa.put(35, "Claudia");
		System.out.println(mapa.get(35));
		mapa.remove(20);
		mapa.remove(35, "Claudia");
		System.out.println(mapa.isEmpty());
		
		
	}

}
