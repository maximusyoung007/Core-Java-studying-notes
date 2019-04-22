package NumberAndString;

/**
 * 把 lengendary 改成间隔大写小写模式，即 LeNgEnDaRy
 */
public class IntervalMode {
    public static void main(String[] args){
        String str = "lengendary";
        char[] s = str.toCharArray();
        s[0] = Character.toUpperCase(s[0]);
        for(int i = 1;i < str.length();i++){
            if(i % 2 == 0){
                s[i] = Character.toUpperCase(s[i]);
            }
        }
        for(int i = 0;i < s.length;i++){
            System.out.print(s[i]);
        }
        String result = new String(s);
        System.out.println("\n" + result);
    }
}
