package sexta_aula;

public class ExplicacaoStringBuilder {

	public static void main(String[] args) {
		
		String nome = "Joao";
		StringBuilder sb = new StringBuilder();
		sb.append("o nome do usuario é ");
		sb.append(nome);
		sb.append(" e possui 18 anos");
		
		System.out.println(sb.toString());
		
		System.out.println(String.format("Usuario: %1$s %nBem vindo, %1$s", nome));
		

	}

}
