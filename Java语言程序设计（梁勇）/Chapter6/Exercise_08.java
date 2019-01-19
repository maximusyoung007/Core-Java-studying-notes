package Chapter6;
public class Exercise_08 {
    public static double celsiusToFahrenheit(double celsius){
        double f = (9.0 / 5) * celsius + 32;
        return f;
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        double c = (5.0 / 9) * (fahrenheit - 32);
        return c;
    }
    public static void main(String[] args){
        java.text.DecimalFormat df = new java.text.DecimalFormat("#.##");
        System.out.print("摄氏度\t\t华氏度\t\t\t\t华氏度\t\t摄氏度");
        System.out.print("------------------------------------------");
        double c = 40; double f = 120;
        for (int i = 1; i <= 10; c--, f -= 10, i++) {
            System.out.println(c + "\t\t" + df.format(celsiusToFahrenheit(c)) + "\t|\t" + f + "\t\t" + df.format(fahrenheitToCelsius(f)));
        }
    }
}
