import java.util.function.BiFunction;

public class Java8BiFunctinoal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiFunction<Integer, Integer, Integer> func = (x1, x2) -> x1 + x2;
		int result = func.apply(10,20);
		System.out.println(result);
		BiFunction<Integer, Integer, Double> function = (x1, x2) -> Math.pow(x1, x2);
		Double res = function.apply(2,4);
		System.out.println(res);
	}

}
