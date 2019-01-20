package Chapter6;
class RandomCharacter{
    public static char getRandomCharacter(char ch1,char ch2){
        return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
    }
}
public class Exercise_38 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 10 == 0)
                System.out.println(RandomCharacter.getRandomCharacter('A', 'Z'));
            else
                System.out.print(RandomCharacter.getRandomCharacter('A', 'Z'));
        }
        for (int i = 1; i <= 100; i++) {
            if (i % 10 == 0)
                System.out.println(RandomCharacter.getRandomCharacter('0', '9'));
            else
                System.out.print(RandomCharacter.getRandomCharacter('0', '9'));
        }
    }
}
