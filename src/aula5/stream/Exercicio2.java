package aula5.stream;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Exercicio2 {

	public static void main(String[] args) {
		
		List<Integer> conjunto = new Random().ints(50,1,100).boxed().collect(Collectors.toList());
		System.out.println(conjunto);
		
		List<Integer>maiores50 = conjunto.stream().filter(p -> p >50).collect(Collectors.toList());
		System.out.println(maiores50);
		
		double media = maiores50.stream().mapToInt(Integer::intValue).average().orElse(0);
		System.out.println(media);
		
		

	}

}
