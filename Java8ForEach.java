import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      List<String> list= Arrays.asList("spring","node","mykong");
      list.stream().filter(line->!"node".equals(line)).collect(Collectors.toList()).forEach(System.out::println);
	}

}
