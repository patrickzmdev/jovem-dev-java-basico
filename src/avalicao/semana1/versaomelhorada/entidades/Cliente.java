package avalicao.semana1.versaomelhorada.entidades;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Cliente {

	public String nome;
	public LocalDate dataNasc;

	public static LocalDate conversaoData(String dataString) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		try {
			return LocalDate.parse(dataString, formatter);
		} catch (DateTimeException e) {
			System.out.println("Erro na conversão da data: " + e.getMessage());
			return null;
		}
	}

	public int calcularIdade() {
		LocalDate hoje = LocalDate.now();
		return Period.between(dataNasc, hoje).getYears();
	}

	public boolean estaDeAniversario() {
		LocalDate hoje = LocalDate.now();
		return hoje.getMonth() == dataNasc.getMonth() && hoje.getDayOfMonth() == dataNasc.getDayOfMonth();
	}
	
	public String mascaraNome(String nome) {
		int comp = nome.length();
		int visivelInicio = Math.min(1, comp);
		String pLetra = nome.substring(0, visivelInicio);
		
		if(comp > 2) {
			String mascara = repetirAsterisco(comp - visivelInicio);
			return pLetra + mascara;
		}else {
			return nome;
		}
		
	}
	
	private static String repetirAsterisco(int quantidade) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < quantidade; i++) {
            sb.append('*');
        }
        return sb.toString();
    }

}
