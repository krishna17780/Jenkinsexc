import java.util.stream.Stream;

public class SreamFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream.iterate(new int[] { 0, 1 }, n -> new int[] { n[1], n[0] + n[1] }).limit(20).map(n -> n[0])
				.forEach(System.out::println);
	}

}
