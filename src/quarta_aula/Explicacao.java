package quarta_aula;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class Explicacao {

	public static void main(String[] args) {

		
////		Runnable r = new Runnable() {
////			@Override
////			public void run() {
////				for(int i = 0; i < 100; i++ ) {
////					System.out.println(i);
////				}
////				
////			}
////		};
//		Runnable rLambda = () -> {      //funcao lambda só pode ser executada no mesmo local
//			for(int i = 0; i < 100; i++ ) {
//				System.out.println(i);
//			};
//		
////		Thread t = new Thread(rLambda);
////		System.out.println("Iniciando a thread");
////		t.start();
////		
////		System.out.println("Terminou o metodo principal");
//
//	};
	List<String> lista = new ArrayList<String>();
	
	lista.add("aaaaa2");
	lista.add("aaaaa3");
	lista.add("aaaaaeeeeeeeeeeeeeeeeeeeeeeeeeeeeee4");
	lista.add("aaaaa5");
	lista.add("aaaaa6");
	lista.add("abc");
	lista.add("abcd");
	lista.add("abce");
	
	lista.forEach(System.out::println);
	
//	String s1 = "ABC";
//	String o = Optional.ofNullable(s1).orElseGet(() -> pegaString());
//	System.out.println(o);
	
	String s1 = "ABC";
	Supplier<String> supplier = () -> "DEF";
	System.out.println(supplier.get());
	System.out.println(s1);
	
	lista.removeIf(s -> s.contains("3"));
	
	lista.stream().map(s-> s.length()).forEach(System.out::println);
	
	lista.forEach((String s) -> {
		System.out.println(lista);
	});
	
	String filtro = "abc";
	lista.removeIf(filtro::equals);
	System.out.println(lista);
	
	
//	FunctionalInterfaceCalculadora c1 = (v1,v2) -> v1 *v2;
//	FunctionalInterfaceCalculadora c2 = (v1,v2) -> v1 /v2;
//	FunctionalInterfaceCalculadora c3 = Math::pow;//Math.pow(v1,v2)
//	System.out.println(c1.calcula(2.0,5.0));
//	System.out.println(c2.calcula(2.0,5.0));
//	System.out.println(c3.calcula(2.0,5.0));
	
	
	
	}
	
}
