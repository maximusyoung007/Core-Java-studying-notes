package Chapter1;

public class Exercise_11 {
    public static void main(String[] args){
        int i;
        int population;
        for(i = 1;i <= 5;i++){
            population = 312032486 + i * 365 * 24 * 3600 / 7 - i * 365 * 24 * 3600 / 13 + i * 365 * 24 * 3600 / 45;
            if(i == 1){
                System.out.println(i + " year:" + population);
            }
            else
                System.out.println(i + " years:" + population);
        }
    }
}
