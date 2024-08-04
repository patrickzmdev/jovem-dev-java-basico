package avalicao.semana1.versaomelhorada.entidades;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class ItemVenda {
	
	
	
    public List<Produto> listaProduto = new ArrayList<>();
    
    public void adicionarProduto(Produto produto) {
    	listaProduto.add(produto);
    }
	
	
		
	
	public void produtosLoja() {
		System.out.println("-------Conheça Nossos Produtos--------");
		System.out.println("1 - Arroz, valor = 4,90"); 
		System.out.println("2 - Feijão, valor = 7,90"); 
		System.out.println("3 - Ovo, valor = 5,90"); 
		System.out.println("4 - Detergente, valor = 2,90"); 
		System.out.println("5 - Trigo, valor = 6,90"); 
		System.out.println("6 - Refrigerante 2lt, valor = 8,90"); 
		System.out.println("7 - Agua 500ml, valor = 1,90"); 
		System.out.println("8 - Macarrão, valor = 3,50"); 
		System.out.println("9 - Oleo de Soja, valor = 4,00"); 
		System.out.println("10 - Margarina, valor = 5,30");  
		 
	}
	
	public void mostrarProduto() {
		for(Produto produto : listaProduto) {
			JOptionPane.showMessageDialog(null, produto);
		}
	}
	
	
	

}
