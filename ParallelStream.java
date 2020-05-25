import java.util.stream.IntStream;

public class ParallelStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntStream range = IntStream.range(0, 10);
		range.forEach(System.out::println);
		System.out.println("parallel");
		IntStream range1 = IntStream.range(0, 10);

		range1.parallel().forEach(System.out::println);

	}

}
