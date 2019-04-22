package NumberAndString;

/**
 * 1. 生成一个长度是3的随机字符串，把这个字符串作为当做密码
 *
 * 2. 使用穷举法生成长度是3个字符串，匹配上述生成的密码
 *
 * 要求： 分别使用多层for循环 和 递归解决上述问题
 */
public class BreakPassWord {
    public static void main(String[] args){
        RandomString rs = new RandomString();
        String password = rs.randomString(3);
        System.out.println("设置的密码是:" + password);

        char[] strPassword = password.toCharArray();
        String pool = "";
        for(int i = '0';i < '9';i++)
            pool += (char)i;
        for(int i = 'a';i < 'z';i++)
            pool += (char)i;
        for(int i = 'A';i < 'Z';i++)
            pool += (char)i;
        String result = "";
        for(int i = 0;i < strPassword.length;i++){
            for(int j = 0;j < pool.length();j++){
                if(pool.charAt(j) == strPassword[i])
                    result += (char)pool.charAt(j);
            }
        }
        System.out.println("猜测的密码是:" + result);
    }
}
