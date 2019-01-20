package Chapter6;
public class Exercise_29 {
    public static boolean isPrime(int num) {
        if (num == 2)
            return true;
        for (int i = 2; i <= num / 2; i++)
            if (num % i == 0)
                return false;
        return true;
    }
    public static void main(String[] args){
        for(int i = 2;i < 1000;i++){
            int j = i + 2;
            if(isPrime(i) && isPrime(j))
                System.out.println("(" + i + "," + j + ")");
        }
    }
}
