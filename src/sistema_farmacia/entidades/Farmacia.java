package sistema_farmacia.entidades;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import javax.swing.JOptionPane;

public class Farmacia {

	protected Map<Integer, Medicamento> estoque = new HashMap<>();

	public void adicionarMedicamento(Medicamento medicamento) throws IllegalArgumentException {
		if (estoque.containsKey(medicamento.getId())) {
			throw new IllegalArgumentException("Medicamento já existe");
		}
		estoque.put(medicamento.getId(), medicamento);
	}

	public void removerMericamento(int id) throws NoSuchElementException {
		if (!estoque.containsKey(id)) {
			throw new NoSuchElementException("Medicamento não encontrado");
		}
		estoque.remove(id);
	}

	public void atualizarPreco(int id, double novoPreco) throws NoSuchElementException {
		if (!estoque.containsKey(id)) {
			throw new NoSuchElementException("Medicamento não encontrado");
		}
		Medicamento medicamento = estoque.get(id);
		medicamento.setPreco(novoPreco);
	}

	public List<Medicamento> buscaPorNome(String nome) {
		List<Medicamento> resultados = new ArrayList<>();
		estoque.values().forEach(m -> {
			if (m.getNome().equalsIgnoreCase(nome)) {
				resultados.add(m);
			}
		});
		return resultados;
	}

	public void mostrarEstoque() {
		if (estoque.isEmpty()) {
			System.out.println("O estoque está vazio");
		}

		estoque.forEach((id, medicamento) -> {
			System.out.println("Id" + id);
			System.out.println("Nome: " + medicamento.getNome());
			System.out.println("Preço: " + medicamento.getPreco());
			System.out.println("Validade: " + medicamento.getDataValidade());
			System.out.println("--------------------------------------");
		});
	}

	public double calcularValorTotalCompra(Map<Integer, Integer> quantidades) {
		double total = 0;
		for (Map.Entry<Integer, Integer> entry : quantidades.entrySet()) {
			Medicamento medicamento = estoque.get(entry.getKey());
			if (medicamento != null) {
				double precoFinal = medicamento.getPreco();
				// Aplicar desconto se o medicamento está próximo da validade
				if (medicamento.getDataValidade().isBefore(LocalDateTime.now().plusDays(30))) {
					precoFinal *= 0.9; // 10% de desconto;
				}
				total += precoFinal * entry.getValue();
			}
		}
		return total;
	}
}
