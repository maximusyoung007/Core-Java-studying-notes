package Chapter10;
public class Exercise_03 {
    public static void main(String[] args) {
        MyInteger n1 = new MyInteger(5);
        System.out.println("n1 is even? " + n1.isEven());
        System.out.println("n1 is prime? " + n1.isPrime());
        System.out.println("15 is prime? " + MyInteger.isPrime(15));
        char[] chars = {'3', '5', '3', '9'};
        System.out.println(MyInteger.parseInt(chars));
        String s = "3539";
        System.out.println(MyInteger.parseInt(s));
        MyInteger n2 = new MyInteger(24);
        System.out.println("n2 is odd? " + n2.isOdd());
        System.out.println("45 is odd? " + MyInteger.isOdd(45));
        System.out.println("n1 is equal to n2? " + n1.equals(n2));
        System.out.println("n1 is equal to 5? " + n1.equals(5));
    }
}
class MyInteger{
    private int value;
    MyInteger(int value){
        this.value = value;
    }
    public int getValue(){
        return value;
    }
    public boolean isEven(){
        if(value % 2 != 0)
            return false;
        return true;
    }
    public boolean isOdd(){
        if(value % 2 == 0)
            return false;
        return true;
    }
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }
    public static boolean isOdd(int n) {
        return n % 2 != 0;
    }
    public static boolean isEven(MyInteger n) {
        return isEven(n.getValue());
    }
    public static boolean isOdd(MyInteger n){
        return isOdd(n.getValue());
    }

    public boolean isPrime() {
        return isPrime(value);
    }

    public static boolean isPrime(int num) {
        if ((num == 1) || (num == 2)) {
            return true;
        }

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
    public static boolean isPrime(MyInteger o) {
        return isPrime(o.getValue());
    }
    public boolean equals(int anotherNum){
        return value == anotherNum;
    }
    public boolean equals(MyInteger n){
        return value == n.getValue();
    }
    public static int parseInt(char[] number){
        int sum = 0;
        for(int i = 0;i < number.length;i++)
            sum = sum * 10 + (number[i] - '0');
        return sum;
    }
    public static int parseInt(String s){
        int sum = 0;
        for(int i = 0;i < s.length();i++)
            sum = sum * 10 + (s.charAt(i) - '0');
        return sum;
    }
}
