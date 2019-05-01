package TimePractice;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * 找出下个月的倒数第3天是哪天
 */
public class CalendarDemo {
	private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	 
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        //Date now = c.getTime();
        c.set(2016,5,1,12,23,52);
        System.out.println("假设当前时间为：" + format(c.getTime()));
        c.add(Calendar.MONTH, 2);
        c.add(Calendar.DATE, -3);
        System.out.println("下个月倒数第三天为 ：" + format(c.getTime()));
    }
 
    private static String format(Date time) {
        return sdf.format(time);
    }
}
