
public class Employee4 implements Comparable<Employee4> {

	private String name;
	private double salary;
	public Employee4(String n,double s)
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
	public int compareTo(Employee4 other) {
		// TODO Auto-generated method stub
		return Double.compare(salary, other.salary);
	}
	
}
