import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrimitiveArraytoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		List<Integer> lis = Arrays.stream(number).boxed().collect(Collectors.toList());
		System.out.println(lis);
		String[] array = { "a", "b", "c", "d", "e" };
		Stream<String> stream = Stream.of(array);
		stream.forEach(x -> System.out.println(x));
	}

}
