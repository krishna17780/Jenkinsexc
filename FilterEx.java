import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> persons = Arrays.asList(new Person("krishna", 29), new Person("kanth", 28),
				new Person("Hari priyanka", 18), new Person("gopi", 31));
		Person res = persons.stream().filter(x -> "kanth".equals(x.getName())).findAny().orElse(null);
		System.out.println(res);
		System.out.println("-------------------");
		persons.stream().map(Person::getName).collect(Collectors.toList()).forEach(System.out::println);
	}

}
