package Chapter6;
public class Exercise_10 {
    public static boolean isPrime(int n){
        int count = 0;
        for(int i = 2;i < n;i++){
            if(n % i == 0)
                count++;
        }
        if(count == 0)
            return true;
        else
            return false;
    }
    public static void main(String[] args){
        int count = 0;
        for(int i = 2;i < 10000;i++){
            if(isPrime(i))
                count++;
        }
        System.out.print("the number of prime is " + count);
    }
}
