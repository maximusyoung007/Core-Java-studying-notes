package NumberAndString;

import java.util.Scanner;

public class CharacterDemo {
    public static void main(String[] args){
        System.out.println("输入一个字符串");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        //将字符串转换成字符数组
        char s[] = str.toCharArray();

        for(int i = 0;i < s.length;i++){
            if(Character.isUpperCase(s[i]) || Character.isDigit(s[i])){
                System.out.print(s[i]);
            }
        }
    }
}
