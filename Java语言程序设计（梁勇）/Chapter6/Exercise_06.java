package Chapter6;

public class Exercise_06 {
    public static void displayPattern(int n){
        for(int i = 1;i <= n;i++){
            for(int j = n - i;j  >= 1;j--){
                System.out.print("  ");
            }
            for(int k = i;k >= 1;k--){
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        displayPattern(3);
    }
}
