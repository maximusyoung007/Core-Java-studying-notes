package NumberAndString;

/**
 * 把 lengendary 最后一个字母变大写
 */
public class LastToUpper {
    public static void main(String[] args){
        String str = "lengendary";
        char[] s = str.toCharArray();
        for(int i = 0;i < s.length;i++){
            if(i == s.length - 1)
                s[i] = Character.toUpperCase(s[i]);
        }
        String result = new String(s);
        System.out.print(result);
    }
}
