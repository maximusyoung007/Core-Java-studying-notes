package Chapter6;
public class Exercise_13 {
    public static double sum(double n){
        double sum = 0;
        for(int i = 1 ;i <= n;i++){
            sum += i / (i + 1.0);
        }
        return sum;
    }
    public static void main(String[] args){
        java.text.DecimalFormat df = new java.text.DecimalFormat("#.####");
        System.out.println("i            m(i)");
        System.out.println("-----------------");
        for(double i  = 1;i <= 9;i++){
            System.out.print(i + "            " + df.format(sum(i)));
            System.out.println();
        }
        for(double i  = 10;i <= 20;i++){
            System.out.printf(i + "           " + df.format(sum(i)));
            System.out.println();
        }
    }
}
