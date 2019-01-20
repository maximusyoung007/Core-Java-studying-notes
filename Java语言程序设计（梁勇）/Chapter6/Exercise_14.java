package Chapter6;
public class Exercise_14 {
    public static double calclutePi(double n){
        double a = -1,sum = 0;
        for(int i = 1;i <= n;i++){
            a = -a;
            sum += 4 * (a / (2 * i - 1));
        }
        return sum;
    }
    public static void main(String[] args){
        java.text.DecimalFormat df = new java.text.DecimalFormat("#.####");
        System.out.println("i                    m(i)");
        System.out.println("-------------------------");
        System.out.printf("%-21d%-21.4f\n", 1, calclutePi(1));
        for(int i = 101;i <= 901;i += 100){
            System.out.println(i + "                  " + df.format(calclutePi(i)));
        }
    }
}
