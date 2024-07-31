package data_hora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculosComDataHora {
	public static void main(String[] args) {
		
	
	LocalDate d04 = LocalDate.parse("2020-07-30");
	LocalDateTime d05 = LocalDateTime.parse("2020-07-30T01:30:25");
	Instant d06 = Instant.parse("2020-07-30T01:30:25Z");
	LocalDate semanaAnterior = d04.minusDays(7);
	LocalDate proximaSewmana = d04.plusDays(7);
	
	
	LocalDateTime semanaAnteriorLocalDateTime = d05.minusDays(7);
	System.out.println(semanaAnteriorLocalDateTime);
	
	System.out.println("semana anterior" + semanaAnterior );
	System.out.println("semana calculada" + d04);
	System.out.println("semana proxima" + proximaSewmana );
	
	Instant semanaAnteriorInstant = d06.minus(7, ChronoUnit.DAYS);
	Instant semanaProximaInstant = d06.plus(7, ChronoUnit.DAYS);
	
	System.out.println(semanaAnteriorInstant);
	System.out.println(semanaProximaInstant);
	
	Duration t1 = Duration.between(semanaAnterior.atStartOfDay(), d04.atStartOfDay());// localDate precisa ser convertido
	System.out.println("t1 dias = " + t1.toDays());
	Duration t2 = Duration.between(semanaAnteriorLocalDateTime, d05);
	System.out.println("t2 dias = " + t2.toDays());
	
	Duration t3 = Duration.between(semanaAnteriorInstant, d06);
	System.out.println(t3.toDays());
   }
}
