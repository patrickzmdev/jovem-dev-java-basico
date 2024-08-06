package date_time_periodo;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Periodo {

	public static void main(String[] args) {

		LocalDate dataAntiga = LocalDate.of(2020, 2, 7);
		LocalDate dataNova = LocalDate.of(2024, 8, 5);

		System.out.println("Data antiga é maior que data nova " + dataAntiga.isAfter(dataNova));
		System.out.println("Data antiga é anterior a data nova " + dataAntiga.isBefore(dataNova));
		System.out.println("Data são iguais : " + dataAntiga.isEqual(dataNova));

		Period periodo = Period.between(dataAntiga, dataNova);
		System.out.println("Quantos dias: " + periodo.getDays());
		System.out.println("Quantos meses: " + periodo.getMonths());
		System.out.println("Quantos anos: " + periodo.getYears());

		System.out.println("Periodo  :  " + periodo.getYears() + " anos " + periodo.getMonths() + " meses "
				+ periodo.getDays() + " dias ");

		LocalDate dataBase = LocalDate.parse("2019-10-05");
		System.out.println("Mais de 5 dias: " + (dataBase = dataBase.plusDays(5)));
		System.out.println("Mais de 5 semanas: " + (dataBase = dataBase.plusWeeks(5)));
		System.out.println("Mais de 5 meses: " + (dataBase = dataBase.plusMonths(5)));
		System.out.println("Mais de 5 anos: " + (dataBase = dataBase.plusYears(5)));
		System.out.println("Menos de 2 anos: " + (dataBase = dataBase.minusYears(2)));
		System.out.println("Menos de 2 meses: " + (dataBase = dataBase.minusMonths(2)));
		
		LocalDate dataParc = LocalDate.parse("2020-05-02");
		
		for (int i = 1; i <=12; i++) {
			dataParc = dataParc.plusMonths(1);
			
			System.out.println("Data de vencimento do boleto: " + dataParc.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " do mês:" + i);
		}

	}

}
