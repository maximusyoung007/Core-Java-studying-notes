package Chapter7;
public class Exercise_07 {
    public static void main(String[] args){
        int[] count = new int[20];
        for(int i = 0;i < 10;i++)
            count[i] = 0;
        int num = 0;
        for(int i = 0;i < 100;i++){
            num = (int)(Math.random() * 10);
            count[num]++;
        }
        for(int i = 0;i < 10;i++){
            System.out.println("the number of " + i + " is " + count[i]);
        }
    }
}
