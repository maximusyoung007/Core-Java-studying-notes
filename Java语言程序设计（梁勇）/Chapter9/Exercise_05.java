package Chapter9;
import java.util.GregorianCalendar;
public class Exercise_05 {
    public static void main(String[] args) {
        GregorianCalendar g1 = new GregorianCalendar();
        System.out.println(g1.get(GregorianCalendar.YEAR));
        System.out.println((g1.get(GregorianCalendar.MONTH)+1));
        System.out.println(g1.get(GregorianCalendar.DAY_OF_MONTH));
        GregorianCalendar g2 = new GregorianCalendar();
        g2.setTimeInMillis(1234567898765L);
        System.out.println(g2.get(GregorianCalendar.YEAR));
        System.out.println((g2.get(GregorianCalendar.MONTH)+1));
        System.out.println(g2.get(GregorianCalendar.DAY_OF_MONTH));
    }
}
