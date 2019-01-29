package Chapter10;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class Exercise_14{
    public static void main(String[] args){
        MyDate date1 = new MyDate();
        System.out.println("year: " + date1.getYear());
        System.out.println("month: " + date1.getMonth());
        System.out.println("day: " + date1.getDay());
        MyDate date2 = new MyDate(561555550000L);
        System.out.println("year: " + date2.getYear());
        System.out.println("month: " + date2.getMonth());
        System.out.println("day: " + date2.getDay());
    }
}
class MyDate{
    private int year,month,day;
    MyDate(){
        GregorianCalendar date = new GregorianCalendar();
        year = date.get(Calendar.YEAR);
        month = date.get(Calendar.MONTH);
        day = date.get(Calendar.DAY_OF_MONTH);
    }
    MyDate(long elapsedTime){
        GregorianCalendar date = new GregorianCalendar();
        date.setTimeInMillis(elapsedTime);
        year = date.get(Calendar.YEAR);
        month = date.get(Calendar.MONTH);
        day = date.get(Calendar.DAY_OF_MONTH);
    }
    MyDate(int year,int month,int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public int getYear(){
        return year;
    }
    public int getMonth(){
        return month;
    }
    public int getDay(){
        return day;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setMonth(int month){
        this.month = month;
    }
    public void setDay(int day){
        this.day = day;
    }
}