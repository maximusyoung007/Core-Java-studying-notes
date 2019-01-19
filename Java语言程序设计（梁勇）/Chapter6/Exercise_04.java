package Chapter6;

public class Exercise_04 {
    public static int reverse(int number){
        int sum = 0;
        while(number > 0){
            sum = sum * 10 + number % 10;
            number /= 10;
        }
        return sum;
    }
    public static void main(String[] args){
        System.out.print(reverse(1231) + " " + reverse(3456));
    }
}
