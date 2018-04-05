import java.util.*;
public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Employee> staff = new HashMap<>();
		staff.put("144-25-5464",new Employee("Amy Lee"));
		staff.put("567-24-2546",new Employee("Harry Hacker"));
		staff.put("157-56-7894",new Employee("Gary"));
		staff.put("456-62-5527",new Employee("Frances"));
		
		System.out.println(staff);
		staff.remove("567-24-2456");
		staff.put("456-65-5525",new Employee("Fasdsad wwislkj"));
		System.out.println(staff.get("157-62-7935"));
		for(Map.Entry<String, Employee>entry : staff.entrySet())
		{
			String key = entry.getKey();
			Employee value = entry.getValue();
			System.out.println("Key = " + key + ",value=" + value);
		}
	}
}
class Employee {
	private String name;
	public Employee(String n)
	{
		name = n;
	}
	public String getName()
	{
		return name;
	}
}
