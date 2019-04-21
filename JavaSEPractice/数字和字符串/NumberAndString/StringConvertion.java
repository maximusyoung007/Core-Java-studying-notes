package NumberAndString;

/**
 * 把浮点数 3.14 转换为 字符串 "3.14"
 * 再把字符串 “3.14” 转换为 浮点数 3.14
 *
 * 如果字符串是 3.1a4，转换为浮点数会得到什么？
 */
public class StringConvertion {
   public static void main(String[] args){
       double d = 3.14;
       String d1 = String.valueOf(3.14);
       System.out.println(d + "  " + d1);

       String s = "3.14";
       double s1 = Double.parseDouble(s);
       System.out.println(s + "  " + s1);

       String str = "3.1a4";
       double str1 = Double.parseDouble(str);//会发生异常
       System.out.println(str1);
   }

}
