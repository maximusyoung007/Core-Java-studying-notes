package NumberAndString;

/**
 * 创建一个长度是5的随机字符串，随机字符有可能是数字，大写字母或者小写字母
 */
public class RandomString {
    public static void main(String[] args){
        String pool = "";

        //思路：把数字0-9，小写字母a-z,大写字母A-Z全都放到pool里，再随机从pool里取字符放到数组中
        for(int i = '0';i < '9';i++)
            pool += (char)i;
        for(int i = 'a';i < 'z';i++)
            pool += (char)i;
        for(int i = 'A';i < 'Z';i++)
            pool += (char)i;

        char s[] = new char[5];
        for(int i = 0;i < s.length;i++){
            int index = (int)(Math.random() * pool.length());
            s[i] = pool.charAt(index);
        }
        String result = new String(s);
        System.out.println(result);
    }
}
