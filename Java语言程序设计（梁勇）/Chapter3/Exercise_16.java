package Chapter3;
public class Exercise_16 {
    public static void main(String[] args) {
        java.text.DecimalFormat df =new java.text.DecimalFormat("#.##");
        double num1 = Math.random() * 100 - 50;
        double num2 = Math.random() * 200 - 100;
        System.out.println("(" + df.format(num1) + "," + df.format(num2) + ")");
    }
}
