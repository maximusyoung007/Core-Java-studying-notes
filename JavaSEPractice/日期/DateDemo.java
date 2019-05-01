package TimePractice;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * ���������������һ����1995.1.1 00:00:00 �� 1995.12.31 23:59:59 ֮����������
 */
/*
 * ֱ�����һ��Date�����һ��ʱ��
 * calendar.getTime()��ת���Date���͵�����
 * date.getTime() �� System.currentTimeMillis()�����һ��long������
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
		System.out.println("1995��һ�������ʱ���� " + result);
	}
}
