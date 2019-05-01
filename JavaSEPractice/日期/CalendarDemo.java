package TimePractice;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * �ҳ��¸��µĵ�����3��������
 */
public class CalendarDemo {
	private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	 
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        //Date now = c.getTime();
        c.set(2016,5,1,12,23,52);
        System.out.println("���赱ǰʱ��Ϊ��" + format(c.getTime()));
        c.add(Calendar.MONTH, 2);
        c.add(Calendar.DATE, -3);
        System.out.println("�¸��µ���������Ϊ ��" + format(c.getTime()));
    }
 
    private static String format(Date time) {
        return sdf.format(time);
    }
}
