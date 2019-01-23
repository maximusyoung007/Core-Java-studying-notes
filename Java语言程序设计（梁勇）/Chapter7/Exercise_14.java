package Chapter7;
public class Exercise_14 {
    public static int gcd(int...numbers){
        int gcd = numbers[0];
        for(int i = 1;i < numbers.length;i++){
            gcd = gcd(gcd,numbers[i]);
        }
        return gcd;
    }
    public static int gcd(int a,int b){
        int gcd = 0;
        for(int i = 1;i <= a && i <= b;i++){
            if(a % i == 0 && b % i == 0){
                gcd = i;
            }
        }
        return gcd;
    }
    public static void main(String[] args){
        System.out.println(gcd(12,32,24));
        System.out.println(gcd(45,36,81));
        System.out.println(gcd(144,48,36));
    }
}
