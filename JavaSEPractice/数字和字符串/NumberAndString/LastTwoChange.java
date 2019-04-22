package NumberAndString;

/**
 * Nature has given us that two ears, two eyes, and but one tongue, to the end that we should hear and see more than we speak
 * 把最后一个two单词首字母大写
 */
public class LastTwoChange {
    public static void main(String[] args){
        String str = "Nature has given us that two ears, two eyes, and but one tongue, " +
                "to the end that we should hear and see more than we speak";
        //找到最后一个two出现的位置
        int index = str.lastIndexOf("two");

        //将字符串改为数组并将对应位置的字母改为大写
        char[] str2 = str.toCharArray();
        str2[index] = Character.toUpperCase(str2[index]);

        //将字符数组改为字符串输出
        String result = new String(str2);
        System.out.print(result);
    }
}
