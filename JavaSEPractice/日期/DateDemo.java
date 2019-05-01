package TimePractice;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * 借助随机数，创建一个从1995.1.1 00:00:00 到 1995.12.31 23:59:59 之间的随机日期
 */
/*
 * 直接输出一个Date是输出一个时间
 * calendar.getTime()是转变成Date类型的数据
 * date.getTime() 和 System.currentTimeMillis()是输出一个long型数据
 */
public class DateDemo {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.set(1995,0,1,0,0,0);
		Date time1 = c.getTime();
		System.out.println(time1);
		c.set(1995,12,31,23,59,59);
		Date time2 = c.getTime();
		Double time3 = Math.random() * (time2.getTime() - time1.getTime());
		long time = time1.getTime() + time3.longValue();
		Date result = new Date(time);
		System.out.println("1995年一个随机的时间是 " + result);
	}
}
