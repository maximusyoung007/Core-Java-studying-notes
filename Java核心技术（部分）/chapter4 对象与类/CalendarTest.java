import java.text.DateFormatSymbols;
import java.util.*;
public class CalendarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GregorianCalendar d = new GregorianCalendar();
		int today = d.get(Calendar.DAY_OF_MONTH);
		int month = d.get(Calendar.MONTH);
		d.set(Calendar.DAY_OF_MONTH, 1);//set d to start date of month
		int weekday = d.get(Calendar.DAY_OF_WEEK);
		int firstDayOfWeek = d.getFirstDayOfWeek();//get first day of week
		//determine the required indentation for the first line
		int indent = 0;
		while(weekday != firstDayOfWeek)
		{
			indent++;
			d.add(Calendar.DAY_OF_MONTH, -1);
			weekday = d.get(Calendar.DAY_OF_WEEK);
		}
		String[] weekdayNames = new DateFormatSymbols().getShortWeekdays();
		do
		{
			System.out.printf("%4s", weekdayNames[weekday]);
			d.add(Calendar.DAY_OF_MONTH, 1);
			weekday = d.get(Calendar.DAY_OF_WEEK);
		}while(weekday != firstDayOfWeek);
		System.out.println();
		for(int i = 1;i <= indent;i++)
			System.out.print("    ");
		d.set(Calendar.DAY_OF_MONTH,1);
		do
		{
			int day = d.get(Calendar.DAY_OF_MONTH);
			System.out.printf("%3d", day);
			if(day == today)System.out.print("*");
			else System.out.print(" ");
			d.add(Calendar.DAY_OF_MONTH, 1);
			weekday = d.get(Calendar.DAY_OF_WEEK);
			if(weekday == firstDayOfWeek)System.out.println();
		}while(d.get(Calendar.MONTH) == month);//the loop exits when d is day of the next month
		//print final end of line if necessary
		if(weekday != firstDayOfWeek)System.out.println();
	}

}
