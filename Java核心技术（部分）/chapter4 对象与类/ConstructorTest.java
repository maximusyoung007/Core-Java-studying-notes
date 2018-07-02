import java.util.*;
class Employee4
{
	private static int nextId;
	private int id;
	private String name = "";//instance field initialization
	private double salary;
	//static initialization block
	static
	{
		Random generator = new Random();
		nextId = generator.nextInt(10000);
	}
	//object initialization block
	{
		id = nextId;
		nextId++;
	}
	//three overloaded constructor
	public Employee4(String n,double s)
	{
		name = n;
		salary = s;
	}
	
	public Employee4(double s)
	{
		this("Employee4 #" + nextId,s);
	}
	//the default constructor
	public Employee4()
	{
		
	}
	public String getName()
	{
		return name;
	}
	public double getSalary()
	{
		return salary;
	}
	public int getId()
	{
		return id;
	}
}
public class ConstructorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee4[] staff = new Employee4[3];
		staff[0] = new Employee4("Harry",40000);
		staff[1] = new Employee4(60000);
		staff[2] = new Employee4();
		for(Employee4 e:staff)
			System.out.println("name=" + e.getName()
			+ ",id=" + e.getId() + ",salary=" + e.getSalary());
	}
}
