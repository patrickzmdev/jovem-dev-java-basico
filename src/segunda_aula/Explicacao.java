package segunda_aula;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Explicacao {

	public static void main(String[] args) {
		
//		List<String> lista = new ArrayList<>();
//		Collections.sort(null);
		
//		float f1 = 5.7858f;
//		System.out.println(f1);
//		int i1 = (int) f1;
//		System.out.println(i1); convertendo 
		
//		List<Integer> lista = new ArrayList<Integer>();
		
		//só usar == para tipo primitivo
		
		String s1 = "abc";
		String s2 = new String("ABC");
		
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.contains("CC"));
		System.out.println(s1.length());
		
		LocalDate ld = LocalDate.now();
		LocalDate ld1 = LocalDate.of(1984, 1, 1);
		LocalDate ld2 = LocalDate.parse("1999-05-13");
		LocalDate ld3 = LocalDate.parse("13/05/1999", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		System.out.println(ld.plusDays(300)); //adiciona a quantidade de dias como parametro
		//System.out.println(ld1.minus); // tira os dias
		System.out.println(ld2.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println(ld3);
		
		LocalDateTime ld6 = LocalDateTime.now();
		System.out.println(ld6);
		
		System.out.println(s1 == s2);
	}
	
	void metodos() { // se declarar sem colocar o nome do grau de seguranca ele fica acessivel somente dentro do mesmo pacote
		
	}

}
