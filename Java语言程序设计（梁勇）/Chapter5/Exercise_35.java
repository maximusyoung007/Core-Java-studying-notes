package Chapter5;
public class Exercise_35 {
    public static void main(String[] args){
        int i,j;
        double sum = 0;
        for(i = 1;i <= 624;i++){
            j = i + 1;
                sum += 1.0 / (Math.sqrt(i) + Math.sqrt(j));
        }
        System.out.println(sum);
    }
}
