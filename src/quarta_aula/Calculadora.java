package quarta_aula;

public interface Calculadora {
	
	int operar(int a, int b);

    // Método padrão
    default int somar(int a, int b) {
        return a + b;
    }

    // Método estático
    static int multiplicar(int a, int b) {
        return a * b;
    }

	default double calcula(double d, double e) {
		return d / e;
	}
	

}
