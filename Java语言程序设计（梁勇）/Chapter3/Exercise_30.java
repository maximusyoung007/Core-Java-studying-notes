package Chapter3;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Exercise_30 {
    private static SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private static SimpleDateFormat df2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
    public static String getCurrentTimeStr() {
        long starttime = System.currentTimeMillis();
        String datetime = df.format(new Date(starttime));
        return datetime;
    }
    public static String getCurrentTimeStr2(){
        long starttime2 = System.currentTimeMillis();
        String datetime = df2.format(new Date(starttime2));
        return datetime;
    }
    public static void main(String[] args){
        System.out.println(getCurrentTimeStr());
        System.out.println(getCurrentTimeStr2());
    }
}
