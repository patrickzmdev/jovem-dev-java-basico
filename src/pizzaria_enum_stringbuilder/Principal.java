package pizzaria_enum_stringbuilder;


import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		Pedido p = new Pedido();
		
		p.numPedido = 0;
		Pedido p2 = new Pedido(2, TipoPizza.QUATRO_QUEIJOS , 4);
		
		System.out.println(p2.exibirDetalhes());
		
		int op = 0;
		
		do {
			op =Integer.parseInt(JOptionPane.showInputDialog("1 - Realizar Pedido \n" + "2 - Sair"));
			switch(op) {
			case 1:
				p.numPedido += 1;
				TipoPizza.mostrarOpcoes();
				int escolha = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção da pizza: "));
				TipoPizza tipo = TipoPizza.escolherTipoPizza(escolha);
				p.qnt = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de pizzas: "));
				
				Pedido pedido = new Pedido(p.numPedido, tipo, p.qnt);
				System.out.println(pedido.exibirDetalhes());
				
				
				break;
			
			case 2:
				JOptionPane.showMessageDialog(null, "Saindo........");
				break;
				
			default:
				JOptionPane.showMessageDialog(null, "Valor incorreto: ");
				break;
			}
		}while(op != 2);

	}

}
