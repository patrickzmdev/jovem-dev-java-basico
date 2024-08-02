package quarta_aula;

public class Definicao {

	// Funcao anonima: Uma função anônima (também conhecida como lambda) é uma
	// função que não possui um nome específico. Elas são especialmente úteis para
	// implementar interfaces funcionais e passar comportamento como argumentos para
	// métodos, simplificando muitas tarefas de programação comuns.

	// Interfaces Funcionais: Interfaces funcionais são interfaces que têm
	// exatamente um método abstrato, Uma das principais razões para usar interfaces
	// funcionais é a possibilidade de usar expressões lambda para fornecer
	// implementações concisas dessas interfaces.

	// Consumer<T>: Representa uma operação que aceita um único argumento e não
	// retorna nenhum resultado. Usado para realizar operações com os argumentos
	// fornecidos.
	// Ex: Consumer<String> imprimirMensagem = mensagem ->
	// System.out.println("Mensagem: " + mensagem);
	// imprimirMensagem.accept("Olá, mundo!"); // Saída: Mensagem: Olá, mundo!

	// Supplier<T>: Representa uma função que não aceita argumentos e retorna um
	// resultado. Usado para fornecer um valor.
	// Ex: Supplier<Double> gerarNumeroAleatorio = () -> Math.random();
	// System.out.println("Número aleatório: " + gerarNumeroAleatorio.get())

	// Predicate<T>: Representa uma função que testa um argumento e retorna um valor
	// booleano. Usado para validar condições ou aplicar filtros.
	// Ex: Predicate<Integer> ePar = numero -> numero % 2 == 0;
	// // System.out.println("Número 4 é par? " + ePar.test(4)); // Saída: true
	// //System.out.println("Número 5 é par? " + ePar.test(5)); // Saída: false

	// Function<T, R>: Representa uma função que aceita um argumento de tipo T e
	// produz um resultado de tipo R. Usado para transformar ou mapear dados.
	// Ex:  // Implementação do Function que transforma um String em seu comprimento
    // Function<String, Integer> comprimento = s -> s.length();
	// System.out.println("Comprimento da string 'Olá': " + comprimento.apply("Olá")); // Saída: 3
    // System.out.println("Comprimento da string 'Java': " + comprimento.apply("Java")); // Saída: 4


}
