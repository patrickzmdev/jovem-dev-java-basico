package aula1.collections;


import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;


public class Exercicio3 {

	public static void main(String[] args) {
		
		List<Integer> conjunto = new Random().ints(50,1,21).boxed().collect(Collectors.toList());
		System.out.println(conjunto);
		
		Set<Integer> conjuntoOrd = new HashSet<>(conjunto);
		System.out.println(conjuntoOrd);
  }

}
