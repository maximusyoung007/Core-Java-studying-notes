package Chapter6;
public class Exercise_01 {
    public static int getPentagonalNumber(int n){
        return n * (3 * n - 1) / 2;
    }
    public static void main(String[] args){
        int count = 0;
        for(int i = 1;i <= 100;i++){
            System.out.print(getPentagonalNumber(i) + " ");
            count++;
            if(count % 10 == 0)
                System.out.println();
        }
    }
}
