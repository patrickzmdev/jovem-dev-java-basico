package data_hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CriandoData {

	public static void main(String[] args) {
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate d01 = LocalDate.now(); //data atual
		System.out.println(d01);
		
		LocalDateTime d02 =  LocalDateTime.now(); //data com hora atual
		System.out.println(d02);
		
		Instant d03 = Instant.now(); //data hora gmt de londres 
		System.out.println(d03);
		
		LocalDate d04 = LocalDate.parse("2020-07-30"); //converte uma string padronizada em data
		System.out.println(d04);
		
		LocalDateTime d05 = LocalDateTime.parse("2020-07-30T01:30:25");////converte uma string padronizada em data com horario
		System.out.println(d05);
		
		Instant d06 = Instant.parse("2020-07-30T01:30:25Z"); //converte uma string transformando em horario padronizado
		System.out.println(d06);
		
		Instant d07 = Instant.parse("2020-07-30T01:30:25-03:00");//converte uma string transformando em horario padronizado nesse caso -3
		System.out.println(d07);
		
		LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
		System.out.println(d08);
		
		LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);
		System.out.println(d09);
		
		LocalDate d10 = LocalDate.of(2022, 7, 10);
		System.out.println(d10);
		
		LocalDateTime d11 = LocalDateTime.of(2019, 1, 20, 1, 29);
		System.out.println(d11);
	}

}
