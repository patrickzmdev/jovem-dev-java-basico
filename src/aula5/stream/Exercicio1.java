package aula5.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Exercicio1 {

	public static void main(String[] args) {
		
		List<Integer> conjunto = new Random().ints(50,1,100).boxed().collect(Collectors.toList());
		System.out.println(conjunto);
		
		double soma = conjunto.stream().reduce(0, (x,y) -> x + y);
		System.out.println("Somatório: " + soma);
	}

}
