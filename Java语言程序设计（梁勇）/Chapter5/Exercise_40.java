package Chapter5;

public class Exercise_40 {
    public static void main(String[] args){
        int front = 0,behind = 0;
        for(int i = 0;i < 1000000;i++){
            int n = (int)(Math.random() * 2);
            if(n >= 0 && n < 1)front++;
            else behind++;
        }
        System.out.println("behind:" + behind);
        System.out.println("Front:" + front);
    }
}
