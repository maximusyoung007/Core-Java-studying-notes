class Employee2
{
	private static int nextId = 1;
	private String name;
	private double salary;
	private int id;
	public Employee2(String n,double s)
	{
		name = n;
		salary = s;
		id = 0;
	}
	public String getName()
	{
		return name;
	}
	public double getSalary()
	{
		return salary;
	}
	public int getID()
	{
		return id;
	}
	public void setID()
	{
		id = nextId;
		nextId++;
	}
	public static int getNextId()
	{
		return nextId;
	}
	//unit test
	public static void main(String[] args)
	{
		Employee2 e = new Employee2("Harry",50000);
		System.out.println(e.getName() + " " + e.getSalary());
	}
}
public class StaticTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee2[] staff = new Employee2[3];
		
		staff[0] = new Employee2("Tom",40000);
		staff[1] = new Employee2("Dick",60000);
		staff[2] = new Employee2("Harry",65000);
		for(Employee2 e:staff)
		{
			e.setID();
			System.out.println("name=" + e.getName() + ".id=" + e.getID() + ",salary=" + e.getSalary());
		}
		int n = Employee2.getNextId();//no need create item(∂‘œÛ£ø£©
		System.out.println("Next available id=" + n);
	}

}
