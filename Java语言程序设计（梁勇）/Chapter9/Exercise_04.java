package Chapter9;
import java.util.Random;
public class Exercise_04 {
    public static void main(String[] args){
        Random random1 = new Random(1000);
        for(int i = 0;i < 50;i++)
            System.out.println((i + 1) + ":" + random1.nextInt(100));
    }
}
