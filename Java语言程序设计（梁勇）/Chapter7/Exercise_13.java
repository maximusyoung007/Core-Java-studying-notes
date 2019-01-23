package Chapter7;
public class Exercise_13 {
    public static void main(String[] args) {
        System.out.println(getRandom(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24
        ,25,26,27,28,29,30,31,33,32,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51));
    }
    public static int getRandom(int ...numbers) {
            generateRandom: while (true) {
            int value = 1 + (int)(Math.random() * 54);
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == value) {
                    continue generateRandom;
                }
            }
            return value;
        }
    }
}
