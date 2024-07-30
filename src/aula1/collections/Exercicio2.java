package aula1.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Exercicio2 {

	public static void main(String[] args) {
		
		List<Integer> num = new ArrayList<Integer>(50);
		Random random = new Random();
		
		
		for (int i = 0; i < 50; i++) {
			int n = random.nextInt(100);
			num.add(n);
		}
		Collections.sort(num); 
	    Collections.reverse(num);
		System.out.println(num);
		

	}

}
