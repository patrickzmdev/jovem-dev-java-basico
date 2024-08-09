package sistema_farmacia.enums;



public enum TipoMedicamento {
	
	ANALGESICO,
	ANTIBIOTICO,
	ANTIVIRAL;
	
	public static void mostrarOpcoes() {
		System.out.println("Opções de tipos de medicamentos: ");
		for (TipoMedicamento tipo : TipoMedicamento.values()) {
			System.out.println(tipo.name());
		}
	}
	
	public static TipoMedicamento validarEnum(String tipo) throws IllegalAccessException {
		try {
			return TipoMedicamento.valueOf(tipo.toUpperCase());
		}catch ( IllegalArgumentException e) {
			throw new IllegalAccessException("Tipo de medicamento inválido.");
		}
	}
	
	

}
