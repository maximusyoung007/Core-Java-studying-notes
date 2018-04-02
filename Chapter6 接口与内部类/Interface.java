import java.util.*;
public class Interface {
	public static void main(String[] args)
	{
		Employee4[] staff = new Employee4[3];
		staff[0] = new Employee4("harry",35000);
		staff[1] = new Employee4("carl",75000);
		staff[3] = new Employee4("Tony",38000);
		Arrays.sort(staff);
		for(Employee4 e :staff)
			System.out.println("name=" + e.getName() + ",salary=" +e.getSalary());;
	}
}
