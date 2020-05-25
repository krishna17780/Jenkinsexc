import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FindFirstEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> lis = Arrays.asList(1, 3, 4, 55, 66, 7, 7);
		Optional<Integer> first = lis.stream().findFirst();
		if (first.isPresent()) {
			Integer result = first.get();
			System.out.println(result);
		} else {
			System.out.println("no value?");
		}

		List<String> list = Arrays.asList("node", "java", "python", "ruby");
		Optional<String> res = list.stream().filter(x -> !x.equalsIgnoreCase("node")).findFirst();
		if (res.isPresent()) {
			System.out.println(res.get());

		} else {
			System.out.println("no Value?");
		}
		int[] num = { 178, 2, 3, 4, 5, 6, 7, 8 };
		IntStream stream = Arrays.stream(num);
		OptionalInt any = stream.filter(x -> x % 2 == 0).findAny();
		int res1 = any.getAsInt();
		System.out.println(res1);
		System.out.println(Arrays.stream(num).findFirst().getAsInt());
		System.out.println("-----------------------------------");
		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		int sum = integers.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);
		List<String> li = Arrays.asList("9", "A", "Z", "1", "B", "Y", "4", "a", "c");
		li.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).forEach(System.out::println);
	}

}
