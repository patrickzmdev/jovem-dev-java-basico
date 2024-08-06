package date_time_periodo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class ComparandoDatas {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		Date vencBoleto = simpleDateFormat.parse("10/08/2024");
		
		Date dataHoje = simpleDateFormat.parse("05/08/2024");
		
		if(vencBoleto.after(dataHoje)) { // Posterior ou maior ou depois da data atual
			System.out.println("Boleto não vencido");
		}else {
			System.out.println("Boleto vencido - Urgente");
		}
		
		//Date dataPassada = new SimpleDateFormat("dd/MM/yyyy").parse("01/02/2021");
		
		long dias = ChronoUnit.DAYS.between(LocalDate.parse("2024-02-01"), LocalDate.now());
		System.out.println("possui " + dias + " dias entre a faixa de data");

	}

}
