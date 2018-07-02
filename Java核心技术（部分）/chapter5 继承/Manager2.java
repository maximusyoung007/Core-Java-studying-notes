
public class Manager2 extends Employee3 {
	private double bonus;
	public Manager2(String n,double s,int year,int month,int day)
	{
		super(n,s,year,month,day);
	}
	public double getSalary()
	{
		double baseSalary = super.getSalary();
		return baseSalary + bonus;
	}
	public void setBonus(double b)
	{
		bonus = b;
	}
	public boolean equals(Object otherObject)
	{
		if(!super.equals(otherObject)) return false;
		Manager2 other = (Manager2) otherObject;
		return bonus == other.bonus;
	}
	public int hashcode()
	{
		return super.hashCode() + 17 * new Double(bonus).hashCode();
	}
	public String toString()
	{
		return super.toString() + "[bonus=" + bonus + "]";
	}
}
