package aula4.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Exercicio1 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>(50);
		
		Random random = new Random();
		
		for (int i =0; i < 51 ; i++) {
			int n = random.nextInt(100);
			list.add(n);
		
		}
		
		list.forEach((Integer s) -> {
			System.out.println(s);
		});
	}

}
