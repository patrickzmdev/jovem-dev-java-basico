package programa_banco_versaoprof;

import javax.swing.JOptionPane;

public class Program {

	public static void main(String[] args) {
		
		Account accont;
		int number = Integer.parseInt(JOptionPane.showInputDialog("Enter account number:"));
		String holder = JOptionPane.showInputDialog("Enter account holder");
		String res = JOptionPane.showInputDialog("Is there an initial deposity (y/n)");
		
		if(res.equals("y")) {
			double inicilDeposity = Double.parseDouble(JOptionPane.showInputDialog("Enter initial deposit value:"));
			accont = new Account(number, holder, inicilDeposity);
		}
		else {
			accont = new Account(number, holder);
		}
		
		System.out.println(accont);
		
		double depositValue = Double.parseDouble(JOptionPane.showInputDialog("Enter a deposit value: "));
		accont.deposit(depositValue);
		JOptionPane.showMessageDialog(null, "Valor atualizado " + accont);
		
		double withdrawValue = Double.parseDouble(JOptionPane.showInputDialog("Enter a withdraw value: "));
		accont.withdraw(withdrawValue);
		JOptionPane.showMessageDialog(null, "Valor atualizado " + accont);
	}

}
