package tratamento_erros_udemy.primeira_versao.aplicativo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import tratamento_erros_udemy.primeira_versao.entidades.DomainException;
import tratamento_erros_udemy.primeira_versao.entidades.Reservation;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		try {
			System.out.print("Room number: ");
			int number = sc.nextInt();
			System.out.print("Check-in date (dd/MM/yyyy): ");
			Date checkIn = sdf.parse(sc.next());
			System.out.print("Check-out date (dd/MM/yyyy): ");
			Date checkOut = sdf.parse(sc.next());

			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println("Reservation: " + reservation);

			System.out.println();
			System.out.println("Enter data to update the reservation:");
			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkIn = sdf.parse(sc.next());
			System.out.print("Check-out date (dd/MM/yyyy): ");
			checkOut = sdf.parse(sc.next());

			reservation.updateDates(checkIn, checkOut);
			System.out.println("Reservation: " + reservation);

			System.out.println("Reservation: " + reservation);
		} catch (ParseException e) {
			System.err.println("Data formato invalido");
		} catch (DomainException e) {
			System.out.println("Error in reservation " + e.getMessage());
		} catch (RuntimeException e) {
			System.err.println("Unexpeted error");
		}

		sc.close();

	}

}
