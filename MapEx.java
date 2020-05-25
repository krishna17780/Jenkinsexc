import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Staff> staff = Arrays.asList(new Staff("mkyong", 30, new BigDecimal(10000)),
				new Staff("jack", 27, new BigDecimal(20000)), new Staff("lawrence", 33, new BigDecimal(30000)));
		List<StaffPublic> result = staff.stream().map(temp -> {
			StaffPublic obj = new StaffPublic();
			obj.setName(temp.getName());
			obj.setAge(temp.getAge());
			if ("jack".equals(temp.getName())) {
				obj.setExtra("this field is for jack only!");

			}
			return obj;
		}).collect(Collectors.toList());
		System.out.println(result);
	}

}
