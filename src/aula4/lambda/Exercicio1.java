package aula4.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Exercicio1 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>(50);
		
		Random random = new Random();
		
		for (int i =1 ; i < 51 ; i++) {
			int n = random.nextInt(100);
			list.add(n);
		
		}
		
		list.forEach(System.out::println);
	}

}
