package sexta_aula;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.Objects;

public class ExplicacaoBigDecimal {

	public static void main(String[] args) {
		
		double d = 0.1 + 0.2;
		System.out.println(d);
		
		System.out.println(Math.pow(100, 200));
		BigDecimal b1 = BigDecimal.valueOf(2); // é usado valueof no caso de um valor double
		BigDecimal b2 = BigDecimal.valueOf(4);
		System.out.println(b1.add(b2));
		
		BigDecimal b3 = BigDecimal.valueOf(2); 
		BigDecimal b4 = BigDecimal.valueOf(3);
		
		b1.add(b2);// add nao faz a soma diretamente
		System.out.println(b1 = b1.add(b2));
		
		System.out.println(b3.divide(b4, 10, RoundingMode.HALF_EVEN));

		String s1 = null;
		String s2 = "abc";
		
		System.out.println(Objects.equals(s1, s2)); //objects. equals compara mesmo um dos valores sendo null
		
		
		

	}

}
