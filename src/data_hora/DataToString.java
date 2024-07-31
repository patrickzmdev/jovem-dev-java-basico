package data_hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DataToString {

	public static void main(String[] args) {

		LocalDate d04 = LocalDate.parse("2020-07-30");
		LocalDateTime d05 = LocalDateTime.parse("2020-07-30T01:30:25");
		Instant d06 = Instant.parse("2020-07-30T01:30:25Z");

		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault()); // usa
																													// o
																													// horario
																													// do
																													// sistema
																													// local

		System.out.println(d04.format(fmt1));
		System.out.println(fmt1.format(d04));
		System.out.println(d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

		System.out.println(d05.format(fmt2));

		System.out.println(fmt3.format(d06));// converte para o horario local no caso 3 horas a menos

	}

}
