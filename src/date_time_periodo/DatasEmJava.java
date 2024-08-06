package date_time_periodo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatasEmJava {

	public static void main(String[] args) throws ParseException {
		
		Date date = new Date();
		
		System.out.println("data em milissegundos " + date.getTime());
		System.out.println("dia do mes " + date.getDate());
		System.out.println("dia da semana " + date.getDay());
		System.out.println("horas do dia " + date.getHours());
		System.out.println("Minuto da hota " + date.getMinutes());
		System.out.println("Segundos " + date.getSeconds());
		System.out.println("Ano " + (date.getYear() + 1900));
		
		/*--------------------Simple Date Format-------------------------------*/
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm.ss");
		System.out.println("Data atual formato padrão e string " + simpleDateFormat.format(date));
		
		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("Data atual formato banco de dados " + simpleDateFormat.format(date));
		
		System.out.println("Objeto data: " + simpleDateFormat.parse("1987-10-18")); 
		
		simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Objeto data: " + simpleDateFormat.parse("18/10/1997")); 
		

	}

}
