package date_time_periodo;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatandoLocalDate {

	public static void main(String[] args) {
		
		LocalDateTime dataAtual = LocalDateTime.now();
		
		System.out.println("Data e hora atual : " + dataAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
		
		LocalDate localDate = LocalDate.now();
		System.out.println("Data atual" + localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println("Dia da semana " + localDate.getDayOfWeek());
		System.out.println("Dia da semana " + localDate.getDayOfWeek().compareTo(DayOfWeek.SATURDAY));
		System.out.println("Dia do mes " + localDate.getDayOfMonth());
		System.out.println("Dia do ano " + localDate.getDayOfYear());
		System.out.println("Mes " + localDate.getMonth());

	}

}
