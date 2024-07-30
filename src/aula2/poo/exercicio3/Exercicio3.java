package aula2.poo.exercicio3;

import java.time.DateTimeException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

public class Exercicio3 {

	public static void main(String[] args) {
		
		String data = JOptionPane.showInputDialog("Digite uma data no formato: (dd/MM/yyyy) ");
		
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		try {
			LocalDate date = LocalDate.parse(data, format);
			
			DayOfWeek diaSemana = date.getDayOfWeek();
			
			System.out.println("A data " + data + " caiu em: " + diaSemana);
		}catch(DateTimeException e){
			System.out.println("Ocorreu algum erro.");
		}
		
		

	}

}
