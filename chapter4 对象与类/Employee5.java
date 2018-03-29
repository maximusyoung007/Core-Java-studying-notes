package com.horstmann.corejava;
import java.util.*;
public class Employee5 {
	private String name;
	private double salary;
	private Date hireday;
	public Employee5(String n,double s,int year,int month,int day)
	{
		name = n;
		salary = s;
		GregorianCalendar calendar = new GregorianCalendar(year,month - 1,day);
		hireday = calendar.getTime();
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
		return hireday;
	}
	public void raiseSalary(double byPercent)
	{
		double raise = salary * byPercent / 100;
		salary += raise;
	}
}
