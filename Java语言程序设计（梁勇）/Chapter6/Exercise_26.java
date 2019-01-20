package Chapter6;
public class Exercise_26 {
    public static boolean p(int n){
        int result = 0,n2 = n;
        while(n != 0){
            result = result * 10 + n % 10;
            n = n / 10;
        }
        if(result == n2)
            return true;
        else
            return false;
    }
    public static boolean isPrime(int n){
        int count = 0;
        for(int i = 2;i < n / 2;i++){
            if(n % i ==  0)
                count++;
        }
        if(count == 0)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        int count = 0,i = 2;
        while(count < 100){
            if(p(i) && isPrime(i)){
                System.out.print(i + " ");
                count++;
                if(count % 10 == 0)
                    System.out.println();
            }
            i++;
        }
    }
}
