package Chapter6;
public class Exercise_32 {
    public static void main(String[] args) {
        int winCount = 0;
        for (int i = 0; i < 10000; i++) {
            int dice = getDice();
            if (dice == 7 || dice == 11) {
                winCount++;
            }
            else if (dice == 2 || dice == 3 || dice == 12) {
            }
            else {
                int point = dice;
                do{
                    dice = getDice();
                }while (dice != 7 && dice != point);

                if (dice == 7) {
                }
                else {
                    winCount++;
                }
            }
        }
        System.out.println(winCount);
    }
    public static int getDice() {
        int i1 = 1 + (int)(Math.random() * 6);
        int i2 = 1 + (int)(Math.random() * 6);
        return i1 + i2;
    }
}

