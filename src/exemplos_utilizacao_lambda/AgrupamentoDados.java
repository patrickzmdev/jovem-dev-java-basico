package exemplos_utilizacao_lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AgrupamentoDados {

	public static void main(String[] args) {
		// Agrupar uma lista de pessoas por idade
		
		class Person{
			
			String name;
			int age;
			
			
			
			
			public Person(String name, int age) {
				super();
				this.name = name;
				this.age = age;
			}
			public int getAge() {
				return age;
			}
			public void setAge(int age) {
				this.age = age;
			}
			@Override
			public String toString() {
				return "Person [name=" + name + ", age=" + age + "]";
			}
			
			
			
			
			
			
		}
		
		List<Person> people = Arrays.asList(new Person("Ana", 30), new Person("Pedro", 40), new Person("Elena", 30));
		Map<Integer, List<Person>> peopleByAge = people.stream()
		                                               .collect(Collectors.groupingBy(Person::getAge));
		
		System.out.println(peopleByAge);

	}

}
