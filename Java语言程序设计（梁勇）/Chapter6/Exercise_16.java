package Chapter6;

public class Exercise_16 {
    public static int numberOfDaysInAYear(int year){
        int num = 0;
        if((year % 4 == 0 && year % 100 != 0) || year % 400 ==0)
            num = 366;
        else
            num = 365;
        return num;
    }
    public static void main(String[] args){
        for(int i = 2000;i <= 2020;i++)
            System.out.println(i + ":" + numberOfDaysInAYear(i) + " days");
    }
}
