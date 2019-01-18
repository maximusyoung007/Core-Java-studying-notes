package Chapter5;

public class Exercise_27 {
    public static void main(String[] args){
        int year,count = 0;
        for(year = 101;year <= 2100;year++){
            if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
                count++;
                System.out.print(year + "  ");
                if(count % 8 == 0)
                    System.out.println();
            }
        }
        System.out.println("共有" + count + "个闰年");
    }
}
