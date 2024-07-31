package terceira_aula;

import java.io.FileReader;

import javax.swing.JOptionPane;

public class Explicacao {

	public static void main(String[] args)  {

	
		new Explicacao();
		
	
	}

	public Explicacao() throws NotaMaiorQueDezException  {

//		try {
//			Double d  = Double.parseDouble(JOptionPane.showInputDialog("digite um numero"));
//			System.out.println(d);
//		}catch(NumberFormatException e) {
//			System.err.println("O valor digitado não é numero");
//			e.printStackTrace();
//				
//		} catch (Exception e) {
//			System.err.println("O valor digitado é invalido");
//			e.printStackTrace();
//		} finally {
//			System.out.println("Bloco finally");
//		}
//		System.out.println("terminando o programa");
//	}

//		try(FileReader f = new FileReader("c:\\arquivo.txt")){	try with resources passa o caminho diretamente no try entre () 
//			
//		}

		//////////////////// DISPARANDO EXCEÇÕES//////////////////////////////////////

		try {
			Double d = Double.parseDouble(JOptionPane.showInputDialog("Digite uma nota"));
			if( d < 0) {
				throw new IllegalArgumentException("Nota menor que zero");
			}
			if(d > 10) {
				throw new NotaMaiorQueDezException();
			}
			System.out.println(d);
		} catch (NullPointerException | IllegalArgumentException e) {
			System.err.println("Digite um valor valido");
			System.err.println(e.getMessage());
		}
		System.out.println("Continuando o programa");

	}
}
