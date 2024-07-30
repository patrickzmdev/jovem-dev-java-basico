package aula1.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Exercicio5 {

	public static void main(String[] args) {
		
		List<Integer> listNum1 = new ArrayList<Integer>(10);
		List<Integer> listNum2 = new ArrayList<Integer>(10);
		Random random = new Random();
		
		for (int i = 0; i < 10; i++) {
			int n = random.nextInt(30);
			listNum1.add(n);
			
			
		}

		for (int i = 0; i < 10; i++) {
			int n = random.nextInt(30);
			listNum2.add(n);
			
			
		}
		
		Collections.sort(listNum1);
		Collections.sort(listNum2);
		System.out.println("Conjunto 1 " + listNum1);
		System.out.println("Conjunto 2 " +listNum2);
		
		Set<Integer> encontrado = new HashSet<Integer>();
		
		for (int i =0; i<listNum1.size(); i++) {
			for (int j = 0; j < listNum2.size(); j++) {
				if (listNum1.get(i).equals(listNum2.get(j))) {
					encontrado.add(listNum1.get(i));
				}
				
			}
		}
		System.out.println("Intersecção:" + encontrado);

	}

}
