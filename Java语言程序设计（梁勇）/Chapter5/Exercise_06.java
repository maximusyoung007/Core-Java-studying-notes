package Chapter5;
public class Exercise_06 {
    public static void main(String[] args) {
        System.out.printf("%10s%10s    |  %10s%10s\n", "Miles", "Kilometers",
                "Kilometers", "Miles");
        System.out.println("---------------------------------------------");
        int miles = 1;
        int kilometers = 20;
        int count = 1;
        while (count <= 10) {
            System.out.printf("%10d%10.3f    |  %10d%10.3f\n", miles, miles * 1.609,
                    kilometers, kilometers / 1.609);
            miles++;
            kilometers += 5;
            count++;
        }
    }
}

