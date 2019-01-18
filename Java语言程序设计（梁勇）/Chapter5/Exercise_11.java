package Chapter5;
public class Exercise_11 {
    public static void main(String[] args){
        int count = 0;
        for(int i = 100;i <= 200;i++){
            if(i % 5 == 0 ^ i % 6 == 0){
                System.out.print(i + " ");
                count++;
                if(count == 10){
                    System.out.println("\n");
                    count = 0;
                }
            }
        }
    }
}
