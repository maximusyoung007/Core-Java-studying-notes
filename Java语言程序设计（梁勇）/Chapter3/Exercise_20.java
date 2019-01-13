package Chapter3;
public class Exercise_20 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        if (fahrenheit < -58 || fahrenheit > 41) {
            System.out.println("Temperature must be between -58癋 and 41癋");
            System.exit(1);
        }
        System.out.print("Enter the wind speed miles per hour: ");
        double speed = input.nextDouble();
        if (speed < 2) {
            System.out.println("Speed must be greater than or equal to 2");
            System.exit(2);
        }
        double windChillIndex = 35.74 + 0.6215 * fahrenheit - 35.75 *
                Math.pow(speed, 0.16) + 0.4275 * fahrenheit *
                Math.pow(speed, 0.16);
        System.out.println("The wind chill index is " + windChillIndex);
    }
}

