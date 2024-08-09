package sistema_farmacia.entidades;

import java.time.LocalDateTime;
import java.util.List;

import sistema_farmacia.enums.TipoMedicamento;

public class MedicamentoComposto extends Medicamento{

	private List<Medicamento> componentes;

	public MedicamentoComposto(int id, String nome, TipoMedicamento tipo, double preco, LocalDateTime dataValidade) {
		super(id, nome, tipo, preco, dataValidade);
		this.componentes = componentes;
	}
	
	public void adicionarComponente(Medicamento componente) {
		componentes.add(componente);
		
	}
	
	public void removerComponente(Medicamento componente) {
		componentes.remove(componente);
	}

	public List<Medicamento> getComponentes() {
		return componentes;
	}

	public void setComponentes(List<Medicamento> componentes) {
		this.componentes = componentes;
	}
	
	@Override
    public String toString() {
        return super.toString() + ", Componentes: " + componentes;
    }
	
	
}
