package Chapter6;

public class Exercise_28 {
    public static boolean isprime(long num) {
        if (num == 2)
            return true;
        for (int i = 2; i <= num / 2; i++)
            if (num % i == 0)
                return false;
        return true;
    }
    public static void main(String[] args){
        System.out.printf("%-20s%-20s\n","p","2^p-1");
        System.out.println("--------------------------");
        for(int i = 1;i <= 31;i++){
            long prime = (long)Math.pow(2,i) - 1;
            if(isprime(prime)) {
                System.out.printf("%-20d%-20d", prime, i);
                System.out.println();
            }
        }
    }
}
