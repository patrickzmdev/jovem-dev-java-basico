package aula3.tratamentoerros;

import java.util.ArrayList;
import java.util.List;

public class Venda {
	
	String nomeCliente;
	List<Item> itens = new ArrayList<>();
	
	
	public void addItem(Item item) {
		itens.add(item);
	}
	
	public void listaVenda() {
		System.out.println("Nome do cliente:" + nomeCliente);
		for(Item item: itens) {
			System.out.println(item);
		}
	}

}
