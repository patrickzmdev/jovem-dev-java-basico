package data_hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class DataGlobalParaLocal {

	public static void main(String[] args) {
		
		LocalDate d04 = LocalDate.parse("2020-07-30");
		LocalDateTime d05 = LocalDateTime.parse("2020-07-30T01:30:25");
		Instant d06 = Instant.parse("2020-07-30T01:30:25Z");
		
		for ( String s : ZoneId.getAvailableZoneIds()) {
			System.out.println(s);
		}
//		
//		LocalDate r1 = LocalDate.ofInstant(d06,ZoneId.systemDefault() );
//		System.out.println(r1);
		
		System.out.println(d04.getDayOfMonth());
		System.out.println(d04.getMonthValue());

	}

}
