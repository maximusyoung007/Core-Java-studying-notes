import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;
public class Employee3 {
	private String name;
	private double salary;
	private Date hireDay;
	public Employee3(String n,double s,int year,int month,int day)
	{
		name = n;
		salary = s;
		GregorianCalendar calendar = new GregorianCalendar(year,month - 1, day);
		hireDay = calendar.getTime();
	}
	public String getName()
	{
		return name;
	}
	public double getSalary()
	{
		return salary;
	}
	public Date getHireDay()
	{
		return hireDay;
	}
	public void raiseSalary(double bypercent)
	{
		double raise = salary * bypercent / 100;
		salary += raise;
	}
	public boolean equals(Object otherObject)
	{
		if(this == otherObject)return true;
		if(otherObject == null)return false;
		if(getClass() != otherObject.getClass())return false;
		Employee3 other = (Employee3) otherObject;
		return Objects.equals(name, other.name) && salary == other.salary && Objects.deepEquals(hireDay, other.hireDay);
	}
	public int hashCode()
	{
		return Objects.hash(name,salary,hireDay);
	}
	public String toString()
	{
		return getClass().getName() + "[name=" + name + ",salary=" + salary + ",hireDay" + "]";
	}
	
}
