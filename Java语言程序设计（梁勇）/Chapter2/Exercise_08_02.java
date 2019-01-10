package Chapter2;

import java.text.SimpleDateFormat;
import java.util.Date;
public class Exercise_08_02 {
    private static SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public static String getCurrentTimeStr() {
        long starttime = System.currentTimeMillis();
        String datetime = df.format(new Date(starttime));
        return datetime;
    }
    public static void main(String[] args){
        System.out.println(getCurrentTimeStr());
    }
}
