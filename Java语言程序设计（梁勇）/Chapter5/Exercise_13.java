package Chapter5;
public class Exercise_13 {
    public static void main(String[] args){
        int n = 1;
        while(Math.pow(n,3) < 12000){
            n++;
        }
        System.out.println(n - 1);
    }
}
