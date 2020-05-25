import java.util.stream.Stream;

public class StreamIterate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream.iterate(0, n -> n + 1).limit(10).forEach(System.out::print);

		System.out.println("Print odd numbers: ");
		Stream.iterate(0, n -> n + 1).limit(10)
		.filter(x->x%2!=0).forEach(System.out::print);

	}

}
