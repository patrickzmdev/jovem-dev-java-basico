package sistema_farmacia.entidades;

import java.time.LocalDateTime;
import java.util.Map;

public class FarmaciaOnline extends Farmacia{

	public double calcularValorTotalCompra(Map<Integer, Integer> quantidades) {
		double total = 0;
		for(Map.Entry<Integer, Integer> entry: quantidades.entrySet()) {
			Medicamento medicamento = estoque.get(entry.getKey());
			if(medicamento != null) {
				double precoFinal = medicamento.getPreco();
				// Aplicar desconto se o medicamento está próximo da validade
				if(medicamento.getDataValidade().isBefore(LocalDateTime.now().plusDays(30))) {
					precoFinal *= 0.9; // 10% de desconto;
				}
				total += precoFinal * entry.getValue();
			}
		}
		return total;
	}
}
