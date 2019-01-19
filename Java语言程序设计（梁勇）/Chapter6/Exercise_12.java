package Chapter6;
public class Exercise_12 {
    public static void printChars(char ch1,char ch2,int numberPerLine){
        int count = 0;
        for(int i = ch1;i <= ch2;i++){
            count++;
            System.out.print((char)i);
            if(count % numberPerLine == 0)
                System.out.println();
        }
    }
    public static void main(String[] args){
        printChars('1','z',10);
    }
}
