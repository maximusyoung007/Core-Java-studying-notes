package Chapter6;
public class Exercise_03 {
    public static int reverse(int number){
        int sum = 0;
        while(number > 0){
            sum = sum * 10 + number % 10;
            number /= 10;
        }
        return sum;
    }
    public static boolean isPalindrome(int number){
        int sum = reverse((number));
        if(number == sum)
            return true;
        else
            return false;
    }
    public static void main(String[] args){
        System.out.print(isPalindrome(121));
    }
}
