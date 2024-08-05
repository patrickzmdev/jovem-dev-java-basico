package aula5.stream;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Exercicio3 {

	public static void main(String[] args) {
		
		List<Integer> conjunto = new Random().ints(50,1,100).boxed().collect(Collectors.toList());
		System.out.println(conjunto);
		
		long soma = conjunto.stream().filter(p -> p == 25).count();
		
		System.out.println(soma);

	}

}
