package Chapter9;
public class Exercise_03 {
    public static void main(String[] args){
        java.util.Date date = new java.util.Date();
        System.out.println(date.toString());
        long time = 10000;
        for(int i = 0;i < 8;i++){
            date.setTime(time);
            System.out.println(date.toString());
            time *= 10;
        }
    }
}
