package date_time_periodo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class GerandoParcelas {

	public static void main(String[] args) throws ParseException {
		
		Date dataInicial = new SimpleDateFormat("dd/MM/yyyy").parse("05/08/2024");
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dataInicial);
		
		for( int i = 1; i <= 12; i++) {
			calendar.add(Calendar.MONTH, 1);
			
			System.out.println("Parcela número: " + i + " vencimento: " + new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));
		}

	}

}
