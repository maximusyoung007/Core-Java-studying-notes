package Chapter5;
public class Exercise_33 {
    public static void main(String[] args) {
        for (int i = 6; i<= 10000; i++) {
            int sum = 0,j;
            for(j = 1;j <= i-1;j++){
                if(i % j == 0)
                    sum += j;
            }
            if (sum == i) {
                System.out.println(i);
            }
        }
    }
}
