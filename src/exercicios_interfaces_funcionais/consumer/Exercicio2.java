package exercicios_interfaces_funcionais.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Exercicio2 {

	public static void main(String[] args) {
		
		List<String>lista = new ArrayList<>();
		Consumer<String> addToList = lista::add;
		
		addToList.accept("Banana");
		addToList.accept("Maçã");
		addToList.accept("Pera");
		
		System.out.println(lista);

	}

}
