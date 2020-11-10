import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Map<String,Employee> staff = new HashMap<>();
		staff.put("1111", new Employee("±èÁöÈ£",3000.0));
		staff.put("2222", new Employee("±èÁöÈ£2",2000.0));
		staff.put("3333", new Employee("±èÁöÈ£3",1000.0));
		System.out.println(staff);
		
		staff.remove("3333");
		System.out.println(staff);
		staff.put("4444", new Employee("±èÁöÈ£4",1000.0));
		System.out.println(staff);
		
		
		Employee e = staff.get("2222");
		System.out.println(e);
		
		staff.forEach((k, v) -> System.out.println("Key = " + k + ", Value = " + v));
		

	}

}
