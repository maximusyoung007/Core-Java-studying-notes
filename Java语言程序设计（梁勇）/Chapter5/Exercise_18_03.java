package Chapter5;
public class Exercise_18_03 {
    public static void main(String[] args){
        for(int i = 1;i <= 6;i++){
            for(int j = 1;j <= (6 - i) * 2;j++){
                System.out.print(" ");
            }
            for(int k = 1;k <= i;k++){
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
