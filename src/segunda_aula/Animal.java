package segunda_aula;

public abstract class  Animal { // classe abstrata não pode ser instanciada
	
	public int tamanho;
	public String nome;
	
	public void Andar() {
		System.out.println("Animal andando");
	}
	
	protected void metodoProtected() {
		
	}
	
	public abstract void fazerBarulho();

}
