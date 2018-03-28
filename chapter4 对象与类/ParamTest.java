class Employee3
{
	private String name;
	private double salary;
	public Employee3(String n,double s)
	{
		name = n;
		salary = s;
	}
	public String getName()
	{
		return name;
	}
	public double getSalary()
	{
		return salary;
	}
	public void raiseSalary(double byPercent)
	{
		double raise = salary * byPercent / 100;
		salary += raise;
	}
}

public class ParamTest {
	public static void tripleValue(double x)
	{
		x = 3 * x;
		System.out.println("End of method: x= " + x);;
	}
	public static void tripleSalary(Employee3 x)//对象的引用
	{
		x.raiseSalary(200);
		System.out.println("End of method:salary=" + x.getSalary());
	}
	public static void swap1(Employee3 x,Employee3 y)//对象的拷贝
	{
		Employee3 temp = x;
		x = y;
		y = temp;//交换的是拷贝
		System.out.println("End of method:x=" + x.getName());
		System.out.println("End of method:y=" + y.getName());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Testing triplevalue:");
		double percent = 10;
		System.out.println("Before:percent=" + percent);
		tripleValue(percent);
		System.out.println("After:percent=" + percent) ;
		
		System.out.println("\nTesting triplesalay:");
		Employee3 harry = new Employee3("Harry",50000);
		System.out.println("Before:salary=" + harry.getSalary());
		tripleSalary(harry);
		System.out.println("After:salary=" + harry.getSalary());
		
		System.out.println("\nTesting swap:");
		Employee3 a = new Employee3("Alice",70000);
		Employee3 b = new Employee3("Bob",60000);
		System.out.println("Before:a=" + a.getName());
		System.out.println("Before:b=" + b.getName());
		swap1(a,b);
		System.out.println("After:a=" + a.getName());
		System.out.println("After:b=" + b.getName());
	}
}
