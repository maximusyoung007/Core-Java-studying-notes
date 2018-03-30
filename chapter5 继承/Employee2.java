import java.util.Date;
import java.util.GregorianCalendar;
public class Employee2 extends Person{
	private double salary;
	private Date hireDay;
	
	public Employee2(String n,double s,int year,int month,int day)
	{
		super(n);
		salary = s;
		GregorianCalendar calendar = new GregorianCalendar(year,month - 1,day);
		hireDay = calendar.getTime();
	}
	public double getSalary()
	{
		return salary;
	}
	public Date HireDay()
	{
		return hireDay;
	}
	public String getDescription()
	{
		return  String.format("an employee with a salary of $%.2f", salary);
	}
	public void raiseSalary(double byPercent)
	{
		double raise = salary * byPercent / 100;
		salary += raise;
	}
}
