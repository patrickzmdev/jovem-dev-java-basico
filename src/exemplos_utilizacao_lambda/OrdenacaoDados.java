package exemplos_utilizacao_lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class OrdenacaoDados {

	public static void main(String[] args) {
		// Ordenar uma lista de pessoas por nome em ordem alfabética.
		
		class Person {
		    String name;
		    int age;
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public int getAge() {
				return age;
			}
			public void setAge(int age) {
				this.age = age;
			}
			public Person(String name, int age) {
				super();
				this.name = name;
				this.age = age;
			}
			@Override
			public String toString() {
				return "Person [name=" + name + ", age=" + age + "]";
			}

		    
		}
		
		

		List<Person> people = Arrays.asList(new Person("Ana", 30), new Person("Pedro", 40), new Person("Elena", 30));
		List<Person> sortedPeople = people.stream().sorted(Comparator.comparing(Person::getName))
				.collect(Collectors.toList());
		
		System.out.println(sortedPeople);

	}

}
