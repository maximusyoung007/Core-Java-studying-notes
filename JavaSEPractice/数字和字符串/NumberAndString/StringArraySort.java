package NumberAndString;

/**
 * 创建一个长度是8的字符串数组
 * 使用8个长度是5的随机字符串初始化这个数组
 * 对这个数组进行排序，按照每个字符串的首字母排序(无视大小写)
 */
public class StringArraySort {
    private static String randomString(int maxn){
        String pool = "";
        for(int i = 'a';i < 'z';i++)
            pool += (char)i;
        for(int i = 'A';i < 'Z';i++)
            pool += (char)i;
        char[] s = new char[maxn];
        for(int i = 0;i < s.length;i++){
            int index = (int) (Math.random() * pool.length());
            s[i] = pool.charAt(index);
        }
        String result = new String(s);
        return result;
    }

    //冒泡排序
    private static void bubbleSort(String[] s) {
        for (int i = 0; i < s.length; i++)
            for (int j = 0; j < s.length - i - 1; j++)
                if (s[j].compareTo(s[j + 1]) > 0){
                    String temp = s[j];
                    s[j] = s[j + 1];
                    s[j + 1] = temp;
                }
    }
    public static void main(String[] args){
        String[] str = new String[8];
        for(int i = 0;i < str.length;i++){
            str[i] = randomString(5);
            str[i] = str[i].toLowerCase();
        }
        bubbleSort(str);
        for(int i = 0;i < str.length;i++){
            System.out.println(str[i]);
        }
    }
}
