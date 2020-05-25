import java.util.function.Function;

public class FunctionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<String, Integer> func = x -> x.length();
		System.out.println(func.apply("krishna"));
    
		Function<Integer, Integer> func2=x->x*2;
		Integer result=func.andThen(func2).apply("krishna");
		System.out.println(result);
		}

}
